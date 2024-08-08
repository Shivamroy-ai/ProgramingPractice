package ArrayProgram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class FindUniounIntersaction {
    public static void main(String[] args) {

        int arr[]={5,3};
        int arr1[]={1,2,3,4,5};
        int arr2[]={1,2,3};
        Set set=new HashSet();
        LinkedList intersection=new LinkedList();
        int[] arr3= new int[arr1.length+arr2.length+arr.length];

        System.arraycopy(arr,0,arr3,0,arr.length);
        System.arraycopy(arr1,0,arr3,arr.length,arr1.length);
        System.arraycopy(arr2,0,arr3,arr.length+arr1.length,arr2.length);
        System.out.println(Arrays.toString(arr3));

        boolean flag=false;
        for(int i=0;i<arr3.length;i++)
        {
            flag=false;
            for (int j=i+1;j<arr3.length;j++)
            {
                if(arr3[i]==arr3[j] && (arr3[i]!=0))
                {
                    flag=true;
                    set.add(arr3[i]);
                    arr3[j]=0;
                }
            }
            if(!flag && arr3[i]!=0)
            {
                intersection.add(arr3[i]);
            }
        }

        System.out.println("Unioun :-"+set);
        System.out.println("Intersection :-"+intersection);


    }
}
