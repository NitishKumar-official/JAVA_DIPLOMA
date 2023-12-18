public class method_practice01 {
    int z;
    public void addition(int x,int y) {
        z = x + y;
        System.out.println("the edition is = "+z);
    }
    public void substraction(int x, int y){
        z= x-y;
        System.out.println("the substraction is ="+z);
    }

    public static void main(String[] args) {
        method_practice01 obj =new method_practice01();
        obj.addition( 5,6);
        obj.substraction(12,6);
    }
}
