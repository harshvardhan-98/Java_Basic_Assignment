package Question1;

import java.util.Scanner;

public class CheckString {
    public boolean checkString(String s)
    {
        int len = s.length();
        for (int i = 0; i < len - 2; i++)
        {
            if (s.charAt(i) == 'p' && s.charAt(i+2) == 'p')
                return true;
        }
        return false;
    }
    public static void main (String[] args)
    {
        CheckString checkString= new CheckString();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str1 =  sc.nextLine();
        System.out.println("The given string is: "+str1);
        System.out.println("Is pop/p#p appear in the given string? "+checkString.checkString(str1));
    }
}