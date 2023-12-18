public class constructor_program {
    int id;
    String name;
  constructor_program( int id,  String name)

{
    this.id=id;
    this.name=name;

}

    public static void main(String[] args) {
        constructor_program e= new constructor_program(101,"nitish");
        System.out.println("the first employee="+e.name+" "+e.id);
    }
}
