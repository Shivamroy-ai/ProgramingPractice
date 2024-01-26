package ProgramPractice;

public class LargeNo {

    public static void main(String[] args) {

        int arr[]={30,22,127,21,88,91};
        int large=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr.length;j++)
            {
                if (arr[i] <= arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);

        }
    }
}
