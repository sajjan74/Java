import java.util.Arrays;
import java.util.Scanner;

public class arrayInJava {
    public static void main(String[] args){
        // array = a collection of values of the same data

        String [] fruits = {"mango", "guva", "apple", "banana"};
        fruits [0] = "orange";
        int numOfFruits = fruits.length;
        System.out.println(fruits[0]);
        System.out.println(numOfFruits);

        for (int i = 0 ; i < fruits.length; i++){
            System.out.print(fruits[i]+ " ");
        }

        for(String fruit : fruits){
            System.out.println(fruit);
        }

        // sort Array

        Arrays.sort(fruits);


        // Array from user input
//        Scanner scanner = new Scanner(System.in);
//        int[] marks = new int[4];

//        marks[0] = 35;
 //       marks[1] = 57;
//        marks[2] = 89;
//        marks[3] = 79;

//        for (int i = 0; i < marks.length; i++){
//            System.out.println("Enter you number: ");
//            marks[i] = scanner.nextInt();
 //       }

//        for(int mark : marks){
//            System.out.println(mark);
//        }

        // search in Array


        int[] numbers = {1,3,2,5,6,4,6,8,9};
        int target = 7;
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++ ){
            if(numbers[i] == target){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Element not foud in this array");
        }

        Scanner scanner1 = new Scanner(System.in);

        String[] fruits1 = {"Mango", "Banana", "orange", "greps"};
        System.out.print("Enter a fruit search for: ");
        String findfrut;
        boolean isfind = false;
        findfrut = scanner1.nextLine();

        for(int i = 0; i < fruits1.length; i++){
            if(fruits1[i].equals(findfrut)){
                System.out.println("fruits index # is: " + i);
                isfind = true;
                break;
            }
        }
        if(!isfind){
            System.out.println("Frouit not found in array");
        }

        scanner1.close();




    }

}
