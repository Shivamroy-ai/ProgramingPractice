package ArrayProgram;

public class Kadanealog {

//    To solve the problem of finding the maximum subarray sum in the given array arr[] = [-1, -2, -3, -4],
//    we can use Kadane's Algorithm. This algorithm efficiently computes the maximum sum of a contiguous subarray in a given array of integers,
//    which can be both positive and negative.
    public static void main(String[] args) {

        Integer arr[]={1, 2, 3, -2, 5};

        int max_Current_No=arr[0];
        int max_global_NO=arr[0];


        for (int i=1;i<=arr.length-1;i++)
        {
            int current_max=arr[i];

            max_Current_No=max_current_fun(current_max,max_Current_No+(current_max));//3,6,4,9

            max_global_NO=max_current_fun(max_global_NO,max_Current_No);//3,6,4,9
        }

        System.out.println(max_global_NO);
    }

    private static int max_current_fun(int currentMax, int maxElement) {

        int max=currentMax>maxElement?currentMax:maxElement;
        return  max;
    }
}
