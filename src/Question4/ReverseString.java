package Question4;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        s=sc.nextLine();                    //reading input string from user
        System.out.print("After reverse string is: ");
        for(int i=s.length();i>0;--i)                //i is the length of the string
        {
            System.out.print(s.charAt(i-1));            //printing the character at index i-1
        }
    }
}
