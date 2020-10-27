package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of first number:");
        double a = scan.nextInt();

        System.out.println("Enter the value of second number:");
        double b = scan.nextInt();

        double answer;
        double zero = a + b;
        answer = ((a*a)+b) / ((a+b)*(a+b));
        if (zero == 0){
            System.out.println("Attempt to divide by zer0");
        }
        else
            System.out.println("The value of the expression: " + answer);



    }
}
