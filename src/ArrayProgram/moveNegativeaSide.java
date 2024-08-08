package ArrayProgram;

import java.util.Arrays;

public class moveNegativeaSide {

    public static void main(String[] args) {

        int arr[]={-12,-23,-32,-89,-79,-32,-43,-89,89,2,-7,78,3,1};

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
