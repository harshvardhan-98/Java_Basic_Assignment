package Question2;

import java.util.Arrays;

public class SortArray {
    public static void sortBinaryArray(int[] ar)
    {
        int k = 0;

        for (int i = 0; i < ar.length; i++)
        {
            if (ar[i] == 0) {
                ar[k++] = 0;
            }
        }

        for (int i = k; i < ar.length; i++) {
            ar[k++] = 1;
        }
    }

    public static void main (String[] args)
    {
        System.out.println("Test Case 1 ");
        int[] ar = { 0, 1, 1, 0, 1, 1, 0, 1, 0, 0 };
        System.out.println("Original array before sorting : "+ Arrays.toString(ar));
        sortBinaryArray(ar);
        System.out.println("Original array after sorting : "+Arrays.toString(ar));
        System.out.println();
        System.out.println("Test Case 2 ");
        int[] arr = { 1,0,0,0,1,1,1,0,1 };
        System.out.println("Original array before sorting : "+Arrays.toString(arr));
        sortBinaryArray(arr);
        System.out.println("Original array after sorting : "+Arrays.toString(arr));
    }
}
