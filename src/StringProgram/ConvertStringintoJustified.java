package StringProgram;

import java.util.Arrays;

public class ConvertStringintoJustified {

    public static void main(String[] args) {

        String str="the quick brown fox jump over the lazy dog";

        String []arrstr=str.split(" ");
        String strn="";
        System.out.println("Length = "+arrstr.length);
        for (int i=0;i<arrstr.length-1;i++)
        {
            strn=strn+arrstr[i].replace(arrstr[i].charAt(0),Character.toUpperCase(arrstr[i].charAt(0)))+" ";
        }
        System.out.println(strn.trim());
    }
}
