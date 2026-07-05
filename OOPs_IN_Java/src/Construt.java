// Constructor - A special method to initialize objects you can pass argument to constructor.
//               and set up initial values.
class Student {

    String name = "Bob";
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa){
        this.name   = name;
        this.age    = age;
        this.gpa    = gpa;
        this.isEnrolled = isEnrolled;
    }

}

public class Construt{
    public static void main(String[] args){
        Student student1 = new Student("bob", 23 , 3.6);
        Student student2 = new Student("patrick",24,3.2);
        Student student3 = new Student("snady", 21,2.8);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);


    }
}
