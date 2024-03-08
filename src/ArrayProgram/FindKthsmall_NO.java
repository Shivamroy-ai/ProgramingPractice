package ArrayProgram;
public class FindKthsmall_NO {

    // To Find kth small and large first we need to short arr then fetch according to index.
    public static void main(String[] args) {
        int []arr={23,22,78,89,98,74,786,88};

        int kth=3;
         int small=arr[0];

         for (int i=0;i<arr.length;i++)
         {
             for (int j=i+1;j<arr.length;j++)
             {
                 if(arr[i]>arr[j])
                 {
                     int temp=arr[i];
                     arr[i]=arr[j];
                     arr[j]=temp;
                 }
             }
         }
        System.out.println(arr[2]);
    }
}
