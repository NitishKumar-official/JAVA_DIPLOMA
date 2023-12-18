import java.util.Scanner;
public class fact_program {
    int n;
    public static void main(String[] args) {

        int fact=1;
        System.out.println("enter the value of n for focatorail");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        for (int i=1;i<=n;i++)
        {
            fact= fact*i;
        }
        System.out.println("factorial="+fact);

    }

}
