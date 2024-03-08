package ArrayProgram;

import java.util.Arrays;

public class ReverseArray {
// To reverse the array first we need to set first and last index in diffrent varable then creae new array
//  (put (first arr), last index value in new array first position
    // small no and decrease large by 1 and increase small by 1 with condition large>=small
    public static void main(String[] args) {

        int numarr[]={23,77,90,78,76,98,56};
        int numarr2[]=new int[numarr.length];
        System.out.println(" no :- "+7/2);
        int big=numarr.length-1;
        int small=0;

        while (big>=small)
        {
            int temp=small;
            numarr2[small]=numarr[big];
            numarr2[big]=numarr[temp];
                big--;small++;
        }
        System.out.println(Arrays.toString(numarr2));
    }
}
