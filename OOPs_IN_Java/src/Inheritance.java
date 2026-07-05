// Inheritance - One class inherits the attribute and methods from another class.
//               Child <- Parent <- Grandparents
//                 [organisum]
//                     |
//                 [Animals]
//             ________|_______
//            |        |         |
//          [Dog]     [cat]     [Fish](overriding)
//
// Method overriding:- When a subclass provides its own implementation of a method that is already defined.
//                   Allows for code reusability and give specific implementation.

class organisum{
    boolean isAlive;

    organisum(){
        isAlive = true;
    }

}

class Animals extends organisum{

    void eat(){
        System.out.println("The animal is eating");
    }

    void move(){
        System.out.println("This animal is running");
    }
}

class Dog extends Animals{
    int lives = 1;

    public void speak(){
        System.out.println("The dog goes *weof*");
    }


}

class cat extends Animals{
    int lives = 7;

    void speak(){
        System.out.println("The cat goes *meow*");
    }


}

class Fish extends Animals{
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
}
public class Inheritance {
    public static void main(String[] args){

        Dog dog1 = new Dog();
        cat cat1 = new cat();
        Fish fish = new Fish();



        dog1.eat();
        cat1.eat();

        System.out.println(dog1.isAlive);
        System.out.println(cat1.isAlive);

        dog1.speak();
        cat1.speak();

        System.out.println(dog1.lives);
        System.out.println(cat1.lives);

        dog1.move();
        cat1.move();
        fish.move();
    }
}
