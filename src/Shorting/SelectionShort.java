package Shorting;

import java.util.Arrays;

public class SelectionShort {


    public static void main(String[] arg)
    {
        int []arr={64,25,2,12,11};

          for (int i=0;i<arr.length;i++)
        {
            int MIN=i;
            for (int j=i+1;j<arr.length;j++)
            {
                if(arr[MIN]>arr[j])
                {
                    MIN=j;
                }
            }
            System.out.println(Arrays.toString(arr));
                int temp=arr[i];
                arr[i]=arr[MIN];
                arr[MIN]=temp;
        }
        System.out.println("Array Item = "+ Arrays.toString(arr));
    }
}
