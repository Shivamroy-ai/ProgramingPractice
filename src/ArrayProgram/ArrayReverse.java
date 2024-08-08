package ArrayProgram;

import java.util.Arrays;

public class ArrayReverse {

    public static void main(String[] args) {

        int arr[]={22,54,77,897,342,76,65,67};

          for (int i=0;i<=arr.length-1;i++)
          {
              if(i<=(arr.length/2)-1)
              {
                  int temp = arr[i];
                  arr[i] = arr[(arr.length - 1) - i];
                  arr[(arr.length - 1) - i] = temp;
              }
          }

        System.out.println(Arrays.toString(arr));


    }
}
