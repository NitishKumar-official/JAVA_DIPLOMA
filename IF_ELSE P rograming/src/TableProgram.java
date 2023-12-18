import java.util.Scanner;
public class TableProgram {
    public static void main(String[] args) {
        int n;
        System.out.println("enter the value of n=");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }

}
