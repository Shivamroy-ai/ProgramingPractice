package ProgramPractice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleShort {

    public static void main(String[]arg)
    {
//        int []arr={49,33,77,98,11,9,22,233};
        int []arr={53,49,67,78,81,90,112,233};
        for (int i=0;i<arr.length;i++)
        {
            boolean flag=false;
            for (int j=0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    flag=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(flag==false)
            {System.out.println("Count = "+i); break;}
        }
        System.out.println("array item "+ Arrays.toString(arr));
    }
}
