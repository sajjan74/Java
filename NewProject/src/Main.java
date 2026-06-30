import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       //nn


        // int age = 23;
        //int marks = 70;
        //int year = 2026;


        //double gpa = 3.5;
        //double tempreture = 35.5;
//        double price = 300.5;


  //      char grade = 'A';
    //    char Symbol = '!';
      //  char currency = '$';

        //boolean isStudent = false;
//        boolean forSale = false;
  //      boolean isOnline = true;

    //    String name = "Sajjan";
      //  String email = "sd307907@gamil.com";
        //String food = "Pizza";
       // String color = "Skyblue";
       // String car = "Range Rover";


        //System.out.println("your choise is a " + color +" "+ year +" "+ car);
      //  System.out.println("The price is " + currency+price+"k");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        System.out.println("Enter your gpa");
        double gpa = scanner.nextDouble();

        System.out.println("Are you a student? (True or flase)");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello "+ name);
        System.out.println("You are "+ age + "years old");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("");




        scanner.close();

    }
}



