package Question17;

public class ExceptionHandling {
    public static void main(String[] args){

        try {

            System.out.println("Inside the try block");
            int data=25/0;
            System.out.println(data);
        }
        catch(NullPointerException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");
    }
}
