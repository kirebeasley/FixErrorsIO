package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Input your name: ");
        String name = input.nextLine();
        System.out.print("Enter your age: ");
        String age =input.nextLine();
        System.out.print("Enter your DOB year: ");
        String dob =input.nextLine();
        System.out.println("Summary: " + " Your name is: " +  name +  "." + " Your age is: " + age + "." + " Your birth year is: " + dob + ".");
 }
}
