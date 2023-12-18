package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("press 1.namaste,2.hello,3.jayhind");


//         System.out.println("plz inter ur choice 1.2.3");
        Scanner sc = new Scanner(System.in);
       int button=sc.nextInt();
//        if(button==1)
//
//            System.out.println("namaste");
//        }
//        else if(button==2)
//        {
//            System.out.println("hello");
//        }
//        else if(button==3)
//        {
//            System.out.println("jay hind");
//        }
//        else
//        {
//            System.out.println("envalid choice1");
        switch (button){
            case 1:
                System.out.println("namaste");break;
            case 2:
                System.out.println("hello");break;
            case 3:
                System.out.println("jay hind");break;
            default:
                System.out.println("invalid input");break;


        }



    }
}
