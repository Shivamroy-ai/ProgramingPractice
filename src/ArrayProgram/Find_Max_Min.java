package ArrayProgram;

import java.util.Arrays;

public class Find_Max_Min {

    public static void main(String[] args) {


        int arr[]={3, 5, 4, 1, 9};

        for (int i=0;i<arr.length;i++)
        {
            for (int j=i;j<arr.length;j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        System.out.println
        (Arrays.toString(arr) +"\n"+ arr[0] +"is a Max Element\n"+arr[arr.length-1]+ "is a minimum element");

    }
}
