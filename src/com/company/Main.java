package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String name = keyboard.nextLine();
        int credit = keyboard.nextInt();
        double gpa = keyboard.nextDouble();
        double acct = keyboard.nextDouble();
        double MajGpa = keyboard.nextDouble();

        System.out.println("Name :" + name);
        System.out.println("GPA :" + gpa);
        System.out.println("Credits :" + credit);

        if (gpa >= 1.0 && credit >= 120 && acct == 0 && MajGpa >= 2.5) {
            System.out.println("Can graduate");
        } else
            System.out.println("Can Not Graduate");
    }
}

