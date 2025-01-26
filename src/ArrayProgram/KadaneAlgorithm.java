package ArrayProgram;

public class KadaneAlgorithm {

    public static void main(String[] args) {

        int arr[]={2, 3, -8, 7, -1, 2, 3};

        int sum=0;
        int maxSum=Integer.MIN_VALUE;

        for (int num:arr)
        {
            sum=Math.max(num,sum+num);
            System.out.println(" Sum :- "+sum);
            maxSum=Math.max(maxSum,sum);
            System.out.println("Maxsum :- "+maxSum );
        }
        System.out.println(maxSum);

    }
}
