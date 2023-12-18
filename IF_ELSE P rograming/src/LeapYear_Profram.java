import java.util.Scanner;
public class LeapYear_Profram {

    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int y=sc.nextInt();
        if((( y%4==0)&&(y%100==0))|| (y%400==0)){
            System.out.println("THIS IS THE LEAP YEAR");

        }
        else
        {
            System.out.println("this is not leap year");
        }



    }
}
