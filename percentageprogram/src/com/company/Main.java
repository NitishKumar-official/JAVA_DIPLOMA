package com.company;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("taking the input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter subject 1 marks");
        int a = sc.nextInt();
        System.out.println("enter subject 2 marks");
        int b = sc.nextInt();
        System.out.println("enter subject 3 marks");
        int c = sc.nextInt();
        System.out.println("enter subject 4 marks");
        int d = sc.nextInt();
        System.out.println("enter subject 5 marks");
        int e = sc.nextInt();
        float per = ((a+b+c+d+e)*100)/500;
        System.out.println("marks in percentage is");
        System.out.println(per);
        System.out.print("%");
    }
}
