package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxElementArray {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int number=sc.nextInt();
        int []arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if (arr[i] > arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr)+
                " Small Element of Array is :- "+arr[0]+" Larger Element of Array :-"+arr[arr.length-1]);

        System.out.println("Kth Element :- "+arr[number-1]);
    }
}
