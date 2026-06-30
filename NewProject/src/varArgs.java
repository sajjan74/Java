public class varArgs {
    public static void main(String[] args){
        // Variable Argunment (varargs) - It allow a method to accept a baring number
        //                             of argument, They makes method more flexible.
        //                             no need for the overloaded method, Java will pack
        //                              argument into a array ...(ellipsis).

        System.out.println(add(1,2,3,4));
        System.out.println(average(1,2,3,4));


    }
    static int add(int ... numbers){

        int sum = 0;

        for (int numb : numbers){
            sum += numb;
        }
        return sum;



    }

    static double average(double... numbers1){
        double sum1 = 0;


        for(double number: numbers1){
            sum1 += number;


        }
        return sum1/numbers1.length;


    }

}
