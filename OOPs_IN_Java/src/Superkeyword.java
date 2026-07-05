class Person{
    String first;
    String last;

    Person(String first, String last){
        this.first = first;
        this.last = last;
    }
    void Showname(){
        System.out.println(this.first+ " "+this.last);
    }
}

class Student1 extends Person{
    double gpa;

    Student1(String first, String last, double gpa){
        super(first,last);
        this.gpa = gpa;
    }
    void ShowGpa(){
        System.out.println(this.first+"'s"+" "+ "Gpa is "+ this.gpa);
    }


}

class Employee extends Person{
    int salary;

    Employee(String first,String last, int salary){
        super(first,last);
        this.salary = salary;
    }
    void Showsalary(){
        System.out.println(this.first+"'s"+" "+ "Salary is:"+this.salary);
    }

}


public class Superkeyword {
    public static void main(String[] args){
        Person person = new Person("Tom", "Riddle");

        person.Showname();


        Student1 student = new Student1("Harry", "Potter", 3.25);

        student.Showname();
        student.ShowGpa();

        Employee employee =new Employee("Dumble","dour",149549);
        employee.Showsalary();
    }

}
