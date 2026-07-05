// Overloaded constructor :- Allow to class to have multiple constructors with different
//                         parameter lists, unable objects to be initialized in various ways.

class user{
    String username;
    String email;
    int age;

    user(){
        this.username = "Guest user";
        this.email = "Not provided";
    }

    user(String username){
        this.username = username;
        this.email = "Not provided";
    }
    user(String username, String email){
        this.username = username;
        this.email  = email;
    }
    user(String username, String email, int age){
        this.username   = username;
        this.email  =  email;
        this.age = age;
    }


}

public class Overloadedconstructor {
    public static void main(String[] args){
        user user1 = new user("bob");
        user user2 = new user("patric","ps0151@gmail.com");
        user user3 = new user("Sandy", "ps123@gmail.com",23);
        user user4 = new user();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);
    }
}
