package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of p r and t");
        int p = sc.nextInt();
        int r = sc.nextInt();
        int t = sc.nextInt();
        int SI=(p*r*t)/100;
        System.out.println(SI);
	// write your code here
    }
}
