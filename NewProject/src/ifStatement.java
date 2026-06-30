import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args){
         // if Statement = perform a block of code if it's condition true

        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter you age");
        age = scanner.nextInt();

        System.out.print("Enter your name");
        name = scanner.nextLine();

        System.out.print("You are a Student(true/false");
        isStudent = scanner.nextBoolean();


        // Group 1

        if (name.isEmpty()){
            System.out.println("You didn't enter your number!");
        }else {
            System.out.println("Hello " + name + "!");
        }


        // Group2

        if (age >= 65) {
            System.out.println("You are an senior!");
        }
        else if (age >= 16) {
            System.out.println("You are a adult!");
        } else if (age < 0) {
            System.out.println("you haven't been born yet");
        } else if (age == 0) {
            System.out.println("you are a baby");
        }
        else{
            System.out.println("You're and chile");
        }


    // Group 3

    if(isStudent == true){
        System.out.println("Your are a Student!");
    }else {
        System.out.println("You are not a Student");

    }


    scanner.close();
    }
}
