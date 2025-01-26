package ArrayProgram;

import java.util.Arrays;

public class Rotate_Array_by_One {

    public static void main(String[] args) {


        int arr[]={1, 2, 3, 4, 5};

        for (int i=arr.length-1;i>0;i--){

            int temp=arr[i];// 5
            arr[i]=arr[i-1];//4
            arr[i-1]=temp;//5
        }
        System.out.println(Arrays.toString(arr));
    }
}
