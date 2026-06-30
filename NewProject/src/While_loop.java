import java.util.Scanner;

class While_loop{
    public static void main(String[] args){

       // Scanner scanner = new Scanner(System.in);

//        int number = 0;

//        while(number < 1 || number > 10){
//            System.out.print("enter number between 1 -10: ");
//            number = scanner.nextInt();
//        }
//        System.out.println("your choice " + number);

//        scanner.close();



        Scanner scanner1 = new Scanner(System.in);
        int age = 0;

        do{
            System.out.println("enter your age:");
            age = scanner1.nextInt();
        }while (age < 18 || age > 25);

        System.out.println("you age is " + age);

        scanner1.close();


    }


}