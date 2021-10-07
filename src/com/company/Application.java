package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    Scanner scanner = new Scanner(System.in);
    private String input;
    private String studentNumber;
    private final Encoder encoder = new Encoder();

    public void start() {
        int selection = printSelectionMenu();
        printInputMenu();
        prepareData();
        switch (selection) {
            case 1:
                encoder.encrypt();
                break;
            case 2:
                encoder.decrypt();
                break;
        }
    }

    public int printSelectionMenu() {
        System.out.println(
                "Hi, please choose your action\n" +
                        "1.Encrypt \n " +
                        "2.Decrypt"
        );

        String selection = scanner.next();
        if (isNumeric(selection) && Integer.parseInt(selection) <=2 && Integer.parseInt(selection) >0) {
            return Integer.parseInt(selection);
        } else
            System.out.println("Please enter a valid login\n");
        return printSelectionMenu();
    }

    private void printInputMenu() {
        System.out.println("Please enter your student name\n");
        String a = scanner.next();
        if (a.length() >=90){
            System.out.println("Please do not exceed 90 characters");
            printInputMenu();
        }
        else {
        System.out.println("Please enter your student number");
        String b = scanner.next();
       setInput(a);
       setStudentNumber(b);
    }}

    private void prepareData() {
        char[] chars = getInput().toCharArray();
        List<Integer> key = getKeyFromStudentNumber(getStudentNumber());

        encoder.setInputArray(chars);
        encoder.setKey(key);
        encoder.createValues();
    }

    private List<Integer> getKeyFromStudentNumber(String studentNumber) {
        List<Integer> key = new ArrayList<>();
        String substring = studentNumber.substring(studentNumber.length() - 5);
        char[] chars = substring.toCharArray();
        for (char aChar : chars) {
            int numericValue = Character.getNumericValue(aChar);
            key.add(numericValue);
        }
        return key;
    }

    public Application() {
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
