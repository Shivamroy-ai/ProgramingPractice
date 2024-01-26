package exceptionhandling;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ABC {

    public static void main(String []arg1)
    {
        String []arg={"Football","Cricket","volleyboll","Rugby"};

        for (int i=0;i<arg.length;i++)
        {
             for (int j=i;j<arg.length;j++)
             {
                 if(arg[i].charAt(0)<arg[j].charAt(0))
                 {
                     String tem=arg[i];
                     arg[i]=arg[j];
                     arg[j]=tem;
                 }
             }
        }

        System.out.println(Arrays.toString(arg));

    }

}
