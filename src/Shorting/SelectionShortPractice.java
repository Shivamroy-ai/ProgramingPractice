package Shorting;

import java.util.Arrays;

public class SelectionShortPractice
{
    public static void main(String[] args)
    {
        String arr[]={"X","Z","A","R","X"};
        for (int i=0;i<arr.length;i++)
        {
            int Max=i;
            for (int j=i;j<arr.length;j++)
            {
                if(arr[Max].charAt(0)<arr[j].charAt(0))
                {
                    Max=j;
                }
            }
            String temp=arr[i];
            arr[i]=arr[Max];
            arr[Max]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
