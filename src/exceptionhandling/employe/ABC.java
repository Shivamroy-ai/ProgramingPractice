package exceptionhandling.employe;

public class ABC {

    public static void main(String[] args) {

        int []arr={8,15,23,5,10};

        for (int i=0;i<=arr.length-1;i++)
        {
            for (int j=i;j<arr.length-1;j++)
            {
                if(arr[i]<arr[j])
                {
                    int tem=arr[j];
                    arr[j]=arr[i];
                    arr[i]=tem;
                }
            }
        }

        for (int i=0;i<arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
    }

    // abcd
    // adef

   //a[contains(text(),'bcd')]
    // a[contains(text(),'def')]
}
