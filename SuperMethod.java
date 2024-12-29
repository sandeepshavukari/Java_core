class Abc{
    public Abc(int a)
    {
        System.out.println("Inside Def parametarized constructor");
    }
    public Abc()
    {
        System.out.println("Inside the Abc Default Constructor");
    }
}
class Def extends Abc{
    public Def(int a)
    {
        super(5);
        System.out.println("Inside Def parametarized constructor");
    }
    public Def()
    {
        System.out.println("Inside the Def Default Constructor");
    }
}
public class SuperMethod {
    public static void main(String[] args) {
        // Def obj= new Def();
        Def obj1= new Def(1);
    }
}