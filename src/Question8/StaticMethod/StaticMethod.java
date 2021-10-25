package Question8.StaticMethod;

public class StaticMethod {
    public static String firstName="";
    public static String lastName="";
    public static int age;

    public static void display(String f, String l, int a){
        firstName=f;
        lastName=l;
        age=a;
    }
}
class Solution {
    public static void main(String[] args) {
        StaticMethod.display("Harsh", "Vardhan", 22);
        System.out.println("First Name: "+ StaticMethod.firstName);
        System.out.println("Last Name: "+ StaticMethod.lastName);
        System.out.println("Age: "+ StaticMethod.age);
    }
}
