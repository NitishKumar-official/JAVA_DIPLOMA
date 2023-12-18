public class SwapNumber {
    public static void main(String[] args) {
        int x=10,y=20;
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("the value of x="+x +"\nthe value of y="+y);
    }
}