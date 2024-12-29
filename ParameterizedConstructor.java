class Student{
    private String name;
    private int age;
    private int studentId;
    public Student(String name,int age,int studentId)
    {
        this.name=name;
        this.age=age;
        this.studentId=studentId;
        System.out.println(studentId+"-"+name+":"+age);
    }
}
public class ParameterizedConstructor {
    public static void main(String[] args) {
        Student s= new Student("Sandeep",21,1);
    }
}
