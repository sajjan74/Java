import java.util.Scanner;

public class Logical_oprator {
    public static void main(String []args){

        // && = AND
        // || = OR
        // !  = NOT

        double temp = -7;
        boolean isSunney = false;


        if(temp <= 30 && temp >= 0 && isSunney){
            System.out.println("The weather is Good ");
            System.out.println("It is sunny outside");
        }
        else if (temp <= 30 && temp >= 0 && !isSunney){
            System.out.println("The weather is Good");
            System.out.println("Is is cloudy outside");
        } else if (temp >30 || temp < 0) {
            System.out.println("The weather is bad 😥");
        }


        Scanner scanner = new Scanner(System.in);

        // user name must be between 4-12 characters
        // user name not contain spaces or underscore

        String username;

        System.out.println("Enter your new username");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("username must between 4 to 12 characters");

        } else if (username.contains(" ")|| username.contains("_")) {
            System.out.println("Username must not contain spaces or underscore");
            
        } else {
            System.out.printf("Welcome " + username);
        }


        scanner.close();





    }






}
