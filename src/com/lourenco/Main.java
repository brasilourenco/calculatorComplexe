package com.lourenco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator counts = new Calculator();
        //n me lembrava de fazer o scanner
        Scanner scanner = new Scanner(System.in);
        //
        while (true) {
            System.out.println("Chose your operator: ");
            System.out.println("enter 1 to divide it in half;");
            System.out.println("enter 2 to divide the fourth part");
            System.out.println("enter 3 to multiply double;");
            System.out.println("enter 4 to multiply triple;");
            System.out.println("enter 5 to do the sum;");
            System.out.println("enter 6 to do the subtraction;");
            System.out.println("enter 7 to do the multiplication;");
            System.out.println("enter 8 to do the division;");
            byte operator = scanner.nextByte();

            if (operator == 1) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                double result1 = counts.half(insertnum1);
                System.out.println("The half of " + insertnum1 + " is " + result1);
                System.out.println("################################################################## \n");
            }
            else if (operator == 2) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                double result2 = counts.quarter(insertnum1);
                System.out.println("The quarter of " + insertnum1 + " is " + result2);
                System.out.println("################################################################## \n");
            } else if (operator == 3) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                double result3 = counts.theDouble(insertnum1);
                System.out.println("The double of " + insertnum1 + " is " + result3);
                System.out.println("################################################################## \n");
            } else if (operator == 4) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                double result4 = counts.triple(insertnum1);
                System.out.println("The triple of " + insertnum1 + " is " + result4);
                System.out.println("################################################################## \n");
            } else if (operator == 5) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                System.out.println("Ok, insert your 2nd number: ");
                double insertnum2 = scanner.nextDouble();
                double result5 = counts.sum(insertnum1, insertnum2);
                System.out.println("The sum of " + insertnum1 + " + " + insertnum2 + " = " + result5);
                System.out.println("################################################################## \n");
            } else if (operator == 6) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                System.out.println("Ok, insert your 2nd number: ");
                double insertnum2 = scanner.nextDouble();
                double result6 = counts.subtraction(insertnum1, insertnum2);
                System.out.println("The subtraction of " + insertnum1 + " - " + insertnum2 + " = " + result6);
                System.out.println("################################################################## \n");
            } else if (operator == 7) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                System.out.println("Ok, insert your 2nd number: ");
                double insertnum2 = scanner.nextDouble();
                double result7 = counts.multiply(insertnum1, insertnum2);
                System.out.println("The multiplication of " + insertnum1 + " x " + insertnum2 + " = " + result7);
                System.out.println("################################################################## \n");
            } else if (operator == 8) {
                System.out.println("Ok, insert your 1st number: ");
                double insertnum1 = scanner.nextDouble();
                System.out.println("Ok, insert your 2nd number: ");
                double insertnum2 = scanner.nextDouble();
                //esqueci-me que tinha q guardar o resultado numa variavel
                double result8 = counts.division(insertnum1, insertnum2);
                //
                System.out.println("The divison of " + insertnum1 + " : " + insertnum2 + " = " + result8);
                System.out.println("################################################################## \n");
                if (insertnum2 == 0) {
                    System.err.println("ERROR! YOU CANNOT DIVIDE BY 0!");
                    System.exit(0);
                }
            }
        }
    }
}
