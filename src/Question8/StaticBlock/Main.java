package Question8.StaticBlock;

class StaticBlock {
    static int age;
    static String firstName, lastName;

    static {  //static block;
        age=22;
        firstName="Harsh";
        lastName="Vardhan";
    }
}
class Main{
    public static void main(String[] args) {
        System.out.println("Age: "+ StaticBlock.age);
        System.out.println("First Name: "+ StaticBlock.firstName);
        System.out.println("Last Name: "+ StaticBlock.lastName);
    }
}