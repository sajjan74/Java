// GETTER And SETTER
// They help to protect object add rule for accessing or modifying them
// GETTER = Method that makes a field Readable
// SETTER = method that makes a field Writable


class Car3 {

    private String model;
    private String color;
    private int price;

    Car3(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    // Getter methods
    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    int getPrice() {
        return this.price;
    }

    void setColor(){
        this.color = color;
    }

    void setPrice(){
        this.price = price;
    }
}

public class GetterAndSetter {

    public static void main(String[] args) {

        Car3 car3 = new Car3("Charger", "Red", 349490);

        car3.getColor("Blue");
        car3.getPrice(100000);

        System.out.println(
                        car3.getColor() + " " +
                        car3.getModel() + " " +
                        car3.getPrice()
        );
    }
}



