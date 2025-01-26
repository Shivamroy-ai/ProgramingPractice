package StringProgram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToUpperCase {

    public static void main(String[] args) {

        String str="hel        lo           is a Final Class so we can't edit a string object";

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.charAt(0));
        System.out.println(str.startsWith("h"));
        System.out.println(str.toCharArray().length);
        System.out.println(str.length());
        System.out.println(str.trim());
        System.out.println(str.replaceAll(" ",""));

        System.out.println(str.concat(" is a Final Class so we can't edit a string object").substring(20,70));

        char []chararray=str.toLowerCase().replaceAll(" ","").toCharArray();

        for (int i=0;i<chararray.length;i++)
        {
            if(chararray[i]=='a'||chararray[i]=='e'||chararray[i]=='i'||chararray[i]=='o'||chararray[i]=='u')
            {
                System.out.print(chararray[i]+" ");
            }
            else {
                chararray[i]=' ';
            }
        }
        System.out.println(Arrays.toString(chararray));

        List list=new ArrayList();
        int count=0;
        for (int i=0;i<chararray.length;i++)
        {
                if(chararray[i]!=' ') {
                    list.add(chararray[i]);
                }
        }

        System.out.println(list);

    }
}
