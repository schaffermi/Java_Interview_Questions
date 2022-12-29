package interview_Java;

import java.util.Scanner;

public class Divide_Without_Operator {

    public static void main(String[] args) {

        divide(10,5);


    }

    public static void divide(int num1, int num2) {
        int total= num1 + num2;
        int result=0;

        while (total > num2) {
            total = total - num2;
            result++;
        }
        System.out.println(result);

    }



}

/*
Write a method that can divide two numbers without using division operator

 */
