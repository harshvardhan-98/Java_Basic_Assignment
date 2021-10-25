package Question14;

class Assignment //when we run this code and remove Assignment.java class it will show NoClassDefFoundError error.
{
    void assign()
    {
        System.out.println("hello!");
    }
}

public class ErrorHandling {
    public static void main(String[] args) {

        Assignment assignment=new Assignment();
        assignment.assign();

        try
        {
            Class.forName("Harsh Vardhan");
        }
        catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}