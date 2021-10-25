package Question7;

import java.util.Scanner;

public class CountOccurance {
    static int CountString(char ch, String s)
    {
        if(s.length()==0) //base condition,
            return 0;
        int count = 0;

        //checking if the first character of
        //the given string is that character
        //or not
        if(s.charAt(0)==ch)
            count++;

        //this will count the occurrence of given character in the string
        //from index 1 to the last index of the string
        count+= CountString(ch,s.substring(1));


        return count;
    }
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string: ");
        String str=sc.nextLine();
        System.out.println("Enter character: ");
        char c=sc.next().charAt(0);
        System.out.println("Occurrence of "+c+" in "+str+" is: "+ CountString(c,str));
    }
}

