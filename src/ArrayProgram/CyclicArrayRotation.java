package ArrayProgram;

import java.util.Arrays;

public class CyclicArrayRotation {

    public static void main(String[] args) {

        int arr[]={23,89,22,12,89,14,21,31,19};

        for (int i=arr.length-1;i>0;i--)
        {
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
