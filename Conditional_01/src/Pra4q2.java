import java.util.Scanner;
public class Pra4q2 {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks of sub1");
        int a = sc.nextInt();
        System.out.println("enter the value of sub2");
        int b = sc.nextInt();
        System.out.println("enter the value of sub3");
        int c = sc.nextInt();
        if(a>=33 && b>=33 && c>=33)
        {
            System.out.println("you are pass in each sub");
        }
        else
        {
            System.out.println("you are failed");
        }
        int per =((a+b+c)*100)/300;
        if(per>=33) {
            System.out.println("third division");
        }
            else if(per>=45) {
            System.out.println("second division");
        }
            else if (per>=60)
        {
            System.out.println("first division");
        }
        else
        {
            System.out.println("failed");
        }
        System.out.println(per);




    }
}
