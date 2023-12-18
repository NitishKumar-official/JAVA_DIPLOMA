
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if (n%2==0)
        {
            System.out.println("the given number is even");
        }
        else
        {
            System.out.println("the given number is odd");
        }
    }
}
