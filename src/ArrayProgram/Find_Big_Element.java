package ArrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Find_Big_Element {


    public static void main(String[] args) {


        int arr[]={23,43,11,76,35,29,89};

        int temp;
        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if(arr[j]<arr[i])
                {
                     temp=arr[j]+arr[i];
                    arr[j]=temp-arr[i];
                    arr[i]=temp-arr[j];
                }
            }
        }

        System.out.println(Arrays.toString(arr)+"Large : "+arr[arr.length-1] +"  Small "+arr[arr.length-2]);

    }
}
