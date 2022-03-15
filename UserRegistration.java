package com.UserRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistrationSystem {
//Declaring patterns
    static String firstNamePatternRegex = "^[A-Z]{1}[a-z]{3,}$";

    //  UC1- method to validate first name
    public static void validateFirstName() {
        System.out.print("Enter First Name :- ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Pattern pattern = Pattern.compile(firstNamePatternRegex);
        Matcher matcher = pattern.matcher(name);
        boolean retrurn = matcher.matches();
        if (retrurn) {
            System.out.println("FirstName is Valid");
        } else {
            System.out.println("FirstName is Invalid");
        }
    }

        public static void main(String args[]) {
            System.out.println("Welcome to User Registration System Program");
            validateFirstName();
    }
 }
