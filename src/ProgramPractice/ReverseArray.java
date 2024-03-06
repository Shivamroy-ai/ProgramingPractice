package ProgramPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int []arr= new int[]{12, 33, 43, 89, 90, 22};

        for (int i=arr.length-1,j=0;i>=(arr.length/2)&j<=arr.length;i--,j++)
        {
            if(j<i)
            {
               int tem= arr[j];
                arr[j]=arr[i];
                arr[i]=tem;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
