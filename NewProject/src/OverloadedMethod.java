public class OverloadedMethod {
    public static void main(String[] args){

        // overloaded methods = method that's shared the same name, but different parameter
        // signature = name + parameter

        System.out.println(add(1,2, 3));

    }
    static double add(double a, double b){
        return a + b ;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
    static double add(double a, double b, double c, double d){
        return a + b + c + d;
    }


}
