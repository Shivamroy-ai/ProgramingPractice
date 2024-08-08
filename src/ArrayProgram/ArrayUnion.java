package ArrayProgram;

import java.util.Arrays;

public class ArrayUnion {

    public static void main(String[] args) {

        int arr1[]={23,67,86,99,100,22,33,44};
        int arr2[]={99,22,33,44};

        int union[]=new int[arr2.length];
        int insert[]=new int[arr1.length];
        int k=0;
        int n=0;
        for (int i=0;i<arr2.length;i++)
        {
            int j=0;
            boolean flag=false;
            for ( j=i;j<arr1.length;j++)
            {
                if(arr1[j]==arr2[i])
                {
                    flag=true;
                    break;
                }
            }

            if(flag) {
                union[k] = arr2[i];
                k++;
            }
            else { insert[n] = arr1[j]; n++;}
        }

        System.out.println(Arrays.toString(union)+"   "+Arrays.toString(insert));


    }
}
