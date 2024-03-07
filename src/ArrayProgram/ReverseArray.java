package ArrayProgram;

import java.util.Arrays;

public class ReverseArray {

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
            if(big>= numarr.length/2 && small<= numarr.length/2)
            {
                big--;small++;
            }
        }
        System.out.println(Arrays.toString(numarr2));
    }
}
