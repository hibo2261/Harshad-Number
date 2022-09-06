package com.bridgelabz;
import java.util.Scanner;

public class HarshadNumber {
    static int sumOfDigits(int num) // Creating a method for sum of digits
    {
        int sum = 0;
        while (num != 0)
        {
            sum = sum + num % 10;
            num = num/10;
        }

        return sum;
    }


    public static void main(String[] args) {
        System.out.println("********************************************");
        System.out.println(" Welcome to Harshad Number Program....");   //Printing Welcome Meassage
        System.out.println("********************************************");

        System.out.println("Enter A Number --->"); // taking input from user
        Scanner sc = new Scanner(System.in); // creating a scanner object
        int num = sc.nextInt();
        int sum = 0;



            if (num% (sumOfDigits(num)) == 0) // Dividing input by sum of digits
            {
                System.out.println(num+" Is A Harshad Number."); // printing the output
            }

                else
            {
                System.out.println(num+" Is Not A Harshad Number.");
            }

    }
}
