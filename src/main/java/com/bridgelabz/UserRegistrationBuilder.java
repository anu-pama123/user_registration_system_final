package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistrationBuilder
{
    public static boolean checkPattern(String input, String patternNum)
    {
        Pattern pattern = Pattern.compile(patternNum);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find())
        {
            return true;
        }
        return false;
    }
    static void outputChecker(boolean checkPattern)
    {
        if(checkPattern==true)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("InValid");
        }
    }
    public static void main(String[] args)
    {
        Scanner input;
        String firstName, secondName, emailId, mobileNumber;
        input = new Scanner(System.in);
        System.out.println("Enter your name(Should start with capital letter and has minimum 3 character) : ");
        firstName = input.nextLine();
        String pattern = "^[A-Z]{1}+[a-z]{2,}$"; // pattern of first name
        outputChecker(checkPattern(firstName, pattern));
        System.out.println("Enter your second name(Should start with capital letter and has minimum 3 character) : ");
        secondName = input.nextLine();
        String secondNamePattern= "^[A-Z]+[a-z]{2,}$"; // pattern of last name
        outputChecker(checkPattern(secondName, secondNamePattern));
        System.out.println("Enter your email address : ");
        emailId = input.nextLine();
        String emailIdPattern = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.][a-zA-Z]{2,3}){1,2}$"; //pattern of email id
        outputChecker(checkPattern(emailId, emailIdPattern));
        System.out.println("Enter your mobile number) : ");
        mobileNumber = input.nextLine();
        String mobileNumberPattern="^[0-9]{2}(\\s)?[0-9]{10}$"; ; //pattern of mobile number
        outputChecker(checkPattern(mobileNumber, mobileNumberPattern));
    }
}
