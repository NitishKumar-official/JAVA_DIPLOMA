import java.util.Scanner;
public class CheckPosiNega_pro {
    public static void main(String[] args) {
        System.out.println("enter the NUMBER");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        if(n>0){
            System.out.println("this is positive number");

        }
        else if (n<0){
            System.out.println("this is negative number");
        }
        else
        {
            System.out.println("THis is zero");
        }
    }
}
