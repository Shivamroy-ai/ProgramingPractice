package Shorting;

import java.util.Arrays;

public class BubbleShortPractice {

    public static void main(String[] args) {

        String [] str={"Xhivam","Zpple","Eartoon","Riger","Xightning"};
        for (int i=0;i<str.length;i++)
        {
            boolean flag=true;
            for (int j=0;j<str.length-1;j++)
            {
                if(str[j].charAt(0)<str[j+1].charAt(0))
                {
                    flag=false;
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
            }
            if(flag)
            {break;}
        }
        System.out.println(Arrays.toString(str));
    }
}
