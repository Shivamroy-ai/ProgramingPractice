package ProgramPractice;

import java.util.Arrays;

public class SelectionShort {


    public static void main(String[] arg)
    {
        int []arr={64,25,22,12,11};


        int value=arr[0];
        int count=0;

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
                int temp=arr[i];
                arr[i]=arr[MIN];
                arr[MIN]=temp;
        }

        System.out.println("Array Item = "+ Arrays.toString(arr));
    }
}
