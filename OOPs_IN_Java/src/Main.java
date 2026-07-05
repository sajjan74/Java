// object- An entity that can hold data(attribute), and can perform action(method)
//         It is a reference data types.


class Car{
    String make = "BMW";
    String model = "M5 compition";
    int year = 2026;
    double price = 72749.24;
    boolean isRunnuing = false;

    void start(){
        isRunnuing = true;
        System.out.println("You Start the car");
    }
    void stop(){
        isRunnuing = false;
        System.out.println("You stop the car");
    }
}


public class Main{
    public static void main(String[] args){

        Car car = new Car();
        car.isRunnuing = true;
        System.out.println(car.make);
        System.out.println(car.model);
        System.out.println(car.price);
        System.out.println(car.isRunnuing);

        car.start();
        System.out.println(car.isRunnuing);
        car.stop();
        System.out.println(car.isRunnuing);
    }
}	