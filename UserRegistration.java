package com.UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationSystem {
//Declaring patterns
    static String firstNameRegexPattern = "^[A-Z]{1}[a-z]{3,}$";
    static String lastNameRegexPattern= "^[A-Z]{1}[a-z]{3,}$";

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

        public static void main(String args[]) {
            System.out.println("Welcome to User Registration System Program");
            validateFirstName();
            validateLastName();
    }
 }
