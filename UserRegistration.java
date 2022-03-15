package com.UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationSystem {
//Declaring patterns
    // UC1
    public static final String firstNameRegexPattern = "^[A-Z]{1}[a-z]{3,}$";
    //UC2
    public static final String lastNameRegexPattern= "^[A-Z]{1}[a-z]{3,}$";
    //UC3
    public static final String emailRegexPattern = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    //String emailRegexPattern="^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    //UC4
    public static final String mobileNoFormatRegexPattern = "^[9,1]{2}?[0-9]{10}$";
    //UC5-Rule1
    public static final String passwordRegexPatternRule1= "^[a-zA-Z0-9]{8,}$";
          //    String regex = "^[A-Za-z]{8,}$";
    //UC6-Rule2
    public static final String passwordRegexPatternRule2 = "^[A-Z]{1,}[a-z]{7,}$";
       //    String passwordPatternSecondRule="^[A-Z][a-zA-Z0-9]{8,}";





    //  UC1- method to validate first name
    public static void validateFirstName() {
        System.out.print("Enter First Name :- ");
        Scanner sc = new Scanner(System.in);
        String fistName = sc.nextLine();
        Pattern pattern = Pattern.compile(firstNameRegexPattern);
        Matcher matcher = pattern.matcher(fistName);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("FirstName is Valid");
        } else {
            System.out.println("FirstName is Invalid");
        }
    }

    //  UC2- method to validate last name
    public static void validateLastName() {
        System.out.print("Enter Last Name :- ");
        Scanner sc = new Scanner(System.in);
        String lastName = sc.nextLine();
        Pattern pattern = Pattern.compile(lastNameRegexPattern);
        Matcher matcher = pattern.matcher(lastName);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("LastName is Valid");
        } else {
            System.out.println("LastName is Invalid");
        }
    }

    //  UC3- method to validate mail
    public static void validateMail() {
        System.out.print("Enter your Mail ID :- ");
        Scanner sc = new Scanner(System.in);
        String eMail = sc.nextLine();
        Pattern pattern = Pattern.compile(lastNameRegexPattern);
        Matcher matcher = pattern.matcher(eMail);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("Mail ID is Valid");
        } else {
            System.out.println("Mail ID is Invalid");
        }
    }

    //  UC4- method to validate mobile number
    public static void validateMobileNumber() {
        System.out.print("Enter Mobile Number :- ");
        Scanner sc = new Scanner(System.in);
        String mobNum = sc.next();
        Pattern pattern = Pattern.compile(mobileNoFormatRegexPattern);
        Matcher matcher = pattern.matcher(mobNum);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("Mobile Number is Valid");
        } else {
            System.out.println("Mobile Number is Invalid");
        }
    }


    // UC5- Rule1-method to validate password of minimum 8 characters
    public static void validatePasswordRule1() {
        System.out.print("Enter Password :- ");
        Scanner sc = new Scanner(System.in);
        String passWord = sc.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule1);
        Matcher matcher = pattern.matcher(passWord);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    // UC6- Rule2-method to validate password of minimum 1 UpperCase
    public static void validatePasswordRule2() {
        System.out.print("Enter Password :- ");
        Scanner sc = new Scanner(System.in);
        String passWord = sc.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule2);
        Matcher matcher = pattern.matcher(passWord);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

        public static void main(String args[]) {
            System.out.println("Welcome to User Registration System Program");
            validateFirstName();
            validateLastName();
            validateMail();
            validateMobileNumber();
            validatePasswordRule1();
            validatePasswordRule2();
    }
 }
