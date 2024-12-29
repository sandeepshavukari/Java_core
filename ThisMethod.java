class School{
    private String name;
    public School()
    {
        System.out.println("School Default Constructor");
    }
    public School(String name)
    {
        this.name = name;
        System.out.println(name);
    }

}
class Student extends School{
    private int studentId;
    public Student()
    {
        System.out.println("It is Student Default Constructor");
    }
    public Student(int Id)
    {
        this();
        studentId = Id;
        System.out.println(studentId);
    }
}
public class ThisMethod {
    public static void main(String[] args) {
        String name="Chaitanya";
        int id=123;
        // School school = new School(name);
        Student student = new Student(id);
    }
}
