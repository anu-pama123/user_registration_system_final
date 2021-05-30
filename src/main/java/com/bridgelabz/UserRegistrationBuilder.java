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
        Scanner name;
        String input;
        System.out.println("Enter your name(Should start with capital letter and has minimum 3 character) : ");
        name = new Scanner(System.in);
        input = name.nextLine();
        String pattern = "^[A-Z]{1}+[a-z]{2,}$";
        outputChecker(checkPattern(input, pattern));
    }
}
