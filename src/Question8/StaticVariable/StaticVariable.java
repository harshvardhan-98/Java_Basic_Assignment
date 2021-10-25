package Question8.StaticVariable;

public class StaticVariable {
    static  String firstName="Harsh", lastName="Vardhan";
    static int age=22;
    void display(){
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Age: "+ age);
    }
}

class Solution{
    public static void main(String[] args) {
        StaticVariable sv=new StaticVariable();
        sv.display();
    }
}