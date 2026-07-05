import java.awt.*;
//Abstract : It is used to define abstract class and method. Abstraction is the process of hiding
//          implementation details and showing only the essential features.
//          Abstract classes CAN'T be instantiated directly can contain "abstract" method(which method
//          be implemented) and can contain "concrete" methods (which are inherited)

class Rectangle extends Shape{

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return length * width ;
    }

}

class Triangle extends Shape{

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    @Override
    double area(){
        return 0.5 * base * height;
    }

}

class Circle extends Shape {

    double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    double area(){
        return Math.PI * radius * radius;
    }

}

abstract class Shape{
    abstract double area();   //Abstract

    void display(){
        System.out.println("This is Shape");
    }

}
public class Abstraction {
    public static void main(String[] args){

       Circle circle = new Circle(4);
       Triangle triangle = new Triangle(4,5);
       Rectangle rectangle = new Rectangle(7,4);

       circle.display();
       triangle.display();
       rectangle.display();

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }



}
