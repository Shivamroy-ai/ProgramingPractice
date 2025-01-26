package ArrayProgram;

public class maximum_Sum_of_SubArray {

    public static void main(String[] args) {

        int arr[]={2, 3, -8, 7, -1, 2, 3};

        int sum=0;
        int maxsum=0;

        for (int arr1:arr)
        {
            sum=Math.max(arr1,sum+arr1);
            maxsum=Math.max(sum,maxsum);
        }
        System.out.println(maxsum);
    }
}
