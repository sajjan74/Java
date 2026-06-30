import java.util.Scanner;

public class For_loop {
    public static void main(String[] args)throws InterruptedException{
        // for loop = execute some code a CERTAIN amount of time
        Scanner scanner = new Scanner(System.in);
        System.out.print("Start counting form: ");
        System.out.println();

        int start = scanner.nextInt();

        for(int i = start;i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);

        }
        System.out.println("Happy new year");
    }
}
