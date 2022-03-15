package com.UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationSystem {
//Declaring Regex patterns
    //UC1
    public static final String firstNameRegexPattern = "^[A-Z]{1}[a-z]{3,}$";
    //UC2
    public static final String lastNameRegexPattern = "^[A-Z]{1}[a-z]{3,}$";
    //UC3
    public static final String emailRegexPattern = "^[a-zA-Z0-9]+([+_.-][a-zA-Z0-9]+)*[@][a-zA-Z0-9]+[.][a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    //String emailRegexPattern="^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    //UC4
    public static final String mobileNoFormatRegexPattern = "^[9,1]{2}?[0-9]{10}$";
    //UC5-Rule1
    public static final String passwordRegexPatternRule1 = "^[a-zA-Z0-9]{8,}$";
    // String regex = "^[A-Za-z]{8,}$";
    //UC6-Rule2
    public static final String passwordRegexPatternRule2 = "^[A-Z]{1,}[a-z]{7,}$";
    // String passwordPatternSecondRule="^[A-Z][a-zA-Z0-9]{8,}";
    //UC7-Rule3
    public static final String passwordRegexPatternRule3 = "^[A-Z]{1,}[0-9]{1,}[a-z]{6,}$";
    //UC8-Rule4
    // public static final String passwordRegexPatternRule4 = "^[A-Z0-9a-z.%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
    public static final String passwordRegexPatternRule4 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()<>]).{8,}$";
    //UC9
    UserRegistrationSystem user = new UserRegistrationSystem();


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

    // UC7- Rule3-method to validate password of minimum 1 numeric character
    public static void validatePasswordRule3() {
        System.out.print("Enter Password :- ");
        Scanner sc = new Scanner(System.in);
        String passWord = sc.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule3);
        Matcher matcher = pattern.matcher(passWord);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("Password is Valid");
        } else {
            System.out.println("Password is Invalid");
        }
    }

    // UC8- Rule4-method to validate password must contain 1 special character
    public static void validatePasswordRule4() {
        System.out.print("Enter Password :- ");
        Scanner sc = new Scanner(System.in);
        String passWord = sc.next();
        Pattern pattern = Pattern.compile(passwordRegexPatternRule4);
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
        System.out.println("Please select your choices");
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1.To Validate First Name \n2.To Validate Last Name \n3.To Validate Mail Id \n4.To Validate Mobile Number \n5.To Validate Password Rule1 of Min 8 Characters " +
                    "\6.To Validate Password Rule2 of Min One Upper case " + "\n7.To Validate Password Rule3 of One Numeric Character \n8.To Validate Password Rule4 of One Special Character");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    validateFirstName();
                    break;
                case 2:
                    validateLastName();
                    break;
                case 3:
                    validateMail();
                    break;
                case 4:
                    validateMobileNumber();
                    break;
                case 5:
                    validatePasswordRule1();
                    break;
                case 6:
                    validatePasswordRule2();
                    break;
                case 7:
                    validatePasswordRule3();
                    break;
                case 8:
                    validatePasswordRule4();
                    break;
            }
        }
        while (choice != 8);
    }
}
