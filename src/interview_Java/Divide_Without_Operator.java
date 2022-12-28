package interview_Java;

import java.util.Scanner;

public class Divide_Without_Operator {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");

        int num1 = input.nextInt();

        System.out.println("Enter second number");
        int num2 = input.nextInt();

        int total = num1+num2;

        int result=0;

        while (total > num2){
            total=total-num2;
            result++;
        }

        System.out.println("The result is "+ result);

    }

}

/*
Write a method that can divide two numbers without using division operator

 */
