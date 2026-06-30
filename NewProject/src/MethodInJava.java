public class MethodInJava {
    public static void main(String[] args){
        // method = a block of reusable code that is executed when called ()
        String name = "Raya";
        int age = 23;

        //happyBirthday(name,age);

        System.out.println(square(5));
        System.out.println(cube(5));
        System.out.println(ageCheaker(19));

    }
    static void happyBirthday(String name,int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n",name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy birthday to you!");
    }
    static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number*number*number;
    }
    static boolean ageCheaker(int age){
        if (age > 18){
            return true;


        }else {
            return false;
        }
    }
}
