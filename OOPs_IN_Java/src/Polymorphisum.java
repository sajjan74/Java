// Polymorphism:- "Poly" = many and "MORH" = shape
//              object can identify as other objects
//              object can be treated as object of a common superclass.


// Runtime Polymorphism (Dynamic Polymorphism)
//  When the method that gets executed is decided at runtime based on the actual type of the object.


import java.util.Scanner;

class Boat extends Vehical{

    @Override
    void go (){
        System.out.println("You driving a boat");
    }
}

class Bike extends  Vehical{

    @Override
    void go() {
        System.out.println("You riding a bike");
    }
}

class Car1 extends Vehical{

    @Override
    void go(){
        System.out.println("You driving a Car");
    }
}


abstract class Vehical {
    abstract void go();
}


public class Polymorphisum{
    public static void main (String []args){
        Car1 car = new Car1();
        Bike bike  = new Bike();
        Boat boat   = new Boat();


        car.go();
        bike.go();
        boat.go();

        Vehical[] vehicals = {car, bike, boat};

        for(Vehical  vehical: vehicals){
            vehical.go();
        }


        Scanner scanner = new Scanner(System.in);
        Animal1 animal1;
        System.out.print("Would you like a dog or a cat (1=dog and 2 = cat):");
        int choise = scanner.nextInt();

        if(choise == 1){
            animal1 = new Dog1();
            animal1.speak();
        } else if (choise == 2) {
            animal1 = new Cat2();
            animal1.speak();

            
        }

    }

}

class Cat2 extends Animal1{

    @Override
    void speak(){
        System.out.println("The cat goes meow");
    }
}

class Dog1 extends Animal1{

    @Override
    void speak(){
        System.out.println("The dog goes woof");
    }

}

abstract class Animal1{

    abstract void speak();
}

