package ArrayProgram;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class ArrayUnion1 {



    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 7, 8, 4, 5};

        Set set = new HashSet();

        int j;
        for (int i = 0;i < arr1.length; i++)
        {
            set.add(arr1[i]);
        }
        for (int i = 0;i < arr2.length; i++)
        {
            set.add(arr2[i]);
        }
        System.out.println(set );
    }


}
