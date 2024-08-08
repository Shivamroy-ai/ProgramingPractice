package ArrayProgram;

import java.util.Arrays;

public class RotateArrayAntiClockWise
{

    public static void main(String[] args) {

        int arr[] = {23, 43, 87, 56, 47, 89, 10};

        for (int i = 0,j= arr.length-1;i < arr.length && j>0;i++,j--)
        {
            int temp=arr[j];
            arr[j]=arr[i];
             arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));

    }
}
