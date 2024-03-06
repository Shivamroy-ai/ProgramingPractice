package ProgramPractice;

import java.util.Arrays;

public class Swiftarrayoneside {
    public static void main(String[] args) {
        int arr[]=new  int[]{1,0,1,1,0};
        int arr1[]=new int[arr.length];

        boolean tag=false;
        for(int i=0;i<arr.length;i++)
       {
           tag=true;
           for (int j=0;j<arr.length;j++)
           {
               if(arr[i]==1 &&arr[j]==0)
               {
                  arr1[j]=arr[i];
               }
           }
       }
        System.out.println(Arrays.toString(arr));
    }
}
