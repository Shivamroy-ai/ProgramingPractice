package ArrayProgram;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShortArrayWithoutShortingTech {
    public static void main(String[] args) {

        int arr[] = {0,1,1,0,0,0,0,0};

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if(arr[i]<=arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
