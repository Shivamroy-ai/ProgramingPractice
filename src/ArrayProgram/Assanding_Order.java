package ArrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Assanding_Order {

    public static void main(String[] args) {

        int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -6};

        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                if(arr[j]>arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
