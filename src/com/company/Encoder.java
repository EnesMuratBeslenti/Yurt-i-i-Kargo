package com.company;

import java.util.*;

public class Encoder {
    private char[] inputArray;
    private List<Integer> key;
    private HashMap<Character, Character> valueMap = new HashMap<Character, Character>();


    public void encrypt() {
        String response = "";
        Character encryptedChar = ' ';
        for (int i = 0; i < inputArray.length; i++) {
            char inputChar = inputArray[i];
            for (int j = 0; j <=key.get(i % key.size()); j++) {
                if (key.get(i%key.size()) == 0){
                    encryptedChar =inputArray[i];
                }else {
                    encryptedChar = inputArray[i];
                encryptedChar = valueMap.get(inputChar);
                inputChar = encryptedChar;
                break;
            }}


            response += encryptedChar;
        }


        System.out.println(response);
    }

    public void decrypt() {
        String response = "";
        Character encryptedChar = ' ';
        for (int i = 0; i < inputArray.length; i++) {
            char inputChar = inputArray[i];
            for (int j = 0; j <=key.get(i % key.size()); j++) {
                if (key.get(i%key.size()) == 0){
                    encryptedChar =inputArray[i];
                }else {
                    encryptedChar = inputArray[i];
                    encryptedChar =valueMap.get(inputChar);
                    inputChar = encryptedChar;
                    break;
                }}


            response += encryptedChar;
        }


        System.out.println(response);
    }

    public void createValues() {
        valueMap.put(' ', '1');
        valueMap.put('!', 'g');
        valueMap.put('"', 'q');
        valueMap.put('#', 'T');
        valueMap.put('$', 'h');
        valueMap.put('%', 'b');
        valueMap.put('&', 'I');
        valueMap.put('\'', 'F');
        valueMap.put('(', 'M');
        valueMap.put(')', 'y');
        valueMap.put('*', 'W');
        valueMap.put('+', ']');
        valueMap.put(',', 'O');
        valueMap.put('-', ')');
        valueMap.put('.', '%');
        valueMap.put('/', '$');
        valueMap.put('0', '-');
        valueMap.put('1', 'c');
        valueMap.put('2', 'P');
        valueMap.put('3', 'n');
        valueMap.put('4', 'H');
        valueMap.put('5', '(');
        valueMap.put('6', '!');
        valueMap.put('7', 'j');
        valueMap.put('8', '\\');
        valueMap.put('9', 'V');
        valueMap.put(':', 'z');
        valueMap.put(';', 't');
        valueMap.put('<', 'k');
        valueMap.put('=', ' ');
        valueMap.put('>', '*');
        valueMap.put('?', 'S');
        valueMap.put('@', '5');
        valueMap.put('A', '0');
        valueMap.put('B', 'Y');
        valueMap.put('C', 'r');
        valueMap.put('D', '@');
        valueMap.put('E', '.');
        valueMap.put('F', '\'');
        valueMap.put('G', 'x');
        valueMap.put('H', 's');
        valueMap.put('I', '6');
        valueMap.put('J', 'a');
        valueMap.put('K', '7');
        valueMap.put('L', '"');
        valueMap.put('M', 'i');
        valueMap.put('N', 'v');
        valueMap.put('O', '4');
        valueMap.put('P', '^');
        valueMap.put('Q', ',');
        valueMap.put('R', 'm');
        valueMap.put('S', '>');
        valueMap.put('T', 'N');
        valueMap.put('U', '[');
        valueMap.put('V', 'Z');
        valueMap.put('W', 'L');
        valueMap.put('X', '2');
        valueMap.put('Y', '?');
        valueMap.put('Z', 'C');
        valueMap.put('[', ';');
        valueMap.put('\\', 'Q');
        valueMap.put(']', '3');
        valueMap.put('^', 'E');
        valueMap.put('_', 'f');
        valueMap.put('a', '+');
        valueMap.put('b', 'd');
        valueMap.put('c', '#');
        valueMap.put('d', 'e');
        valueMap.put('e', 'D');
        valueMap.put('f', '/');
        valueMap.put('g', 'R');
        valueMap.put('h', '&');
        valueMap.put('i', '9');
        valueMap.put('j', 'A');
        valueMap.put('k', 'p');
        valueMap.put('l', 'X');
        valueMap.put('m', 'G');
        valueMap.put('n', 'U');
        valueMap.put('o', 'w');
        valueMap.put('p', 'u');
        valueMap.put('q', ':');
        valueMap.put('r', '8');
        valueMap.put('s', 'K');
        valueMap.put('t', '_');
        valueMap.put('u', 'o');
        valueMap.put('v', '=');
        valueMap.put('w', 'l');
        valueMap.put('x', 'J');
        valueMap.put('y', 'B');
        valueMap.put('z', '<');
    }


    public Encoder() {
    }

    public char[] getInputArray() {
        return inputArray;
    }

    public void setInputArray(char[] inputArray) {
        this.inputArray = inputArray;
    }

    public List<Integer> getKey() {
        return key;
    }

    public void setKey(List<Integer> key) {
        this.key = key;
    }
}
