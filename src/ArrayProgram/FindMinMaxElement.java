package ArrayProgram;

public class FindMinMaxElement {

    // To Find min and max num from array first we need to set default small and large number
    // then compare arr index wise with small and large num showing below*/

    public static void main(String[] args) {

        int []arr={34,78,98,23,77,91,200,34,786,34,89,67};
          int small=arr[0];
          int large=arr[arr.length-1];
              for(int i=0;i<arr.length;i++)
              {
                  small=arr[i]<small?arr[i]:small;
                  large=arr[i]>large?arr[i]:large;
              }
        System.out.println("Large No :-"+large +"\tSmall No :-"+small);
    }
}
