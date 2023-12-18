import java.util.Scanner;
public class prime_number {
    int n;

    public static void main(String[] args) {
         int temp=0;
        System.out.println("enter the value of n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=2;i<=n; i++)
        {
            if (n % i == 0) {
                temp = temp + 1;
            }
        }
            if(temp==0)
            {
                System.out.println("the number is  prime");
            }
            else
            {
                System.out.println("the number is not  prime");
            }



    }
}
