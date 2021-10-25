package Question3;

import java.util.Scanner;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str =  sc.nextLine();
        System.out.print("Enter which character do you want to remove: ");
        char ch=sc.next().charAt(0);
        String result = removeCharacter(str, ch);
        System.out.println("\nOriginal string:");
        System.out.println(str);
        System.out.println("\nSecond string:");
        System.out.println(result);
    }
    public static String removeCharacter(String str, char ch) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        char[] chArray = str.toCharArray();
        for (char c : chArray) // it will start from 0 to length of the chArray
            if (c != ch) { // it will check if (chArray[i] !=ch),then only it will append element in chArray.
                sb.append(c);
            }
        return sb.toString();
    }
}
