public class breakAndContinue {
    public static void main(String[] args){
        // break = break out of a loop(stop)
        // continue = skip current iteration of a loop(skip)

        for(int i = 0; i < 10 ; i ++){

            if (i == 5){
                break;
            }
            System.out.println(i + " ");

        }

        for (int i = 3; i < 31; i= i+3){
            if (i == 12){
                continue;
            }
            System.out.print(i+" ");
        }

    }
}
