package StringProgram;

import java.util.SplittableRandom;
public class PrintDubblicateCharinString
{
    public static void main(String[] args)
    {
        String str="the quick brown fox jump over the lazy dog the hello the king fox jump over the lazy dog ";
        String []arrstr=str.split(" ");
         int count=0;
        for (int i=0;i<arrstr.length;i++)
        {
            count=1;
            for (int j=i+1;j<arrstr.length;j++)
            {
                if(arrstr[i].equals(arrstr[j]))
                {
                    count++;
                    arrstr[j]=null;
                }
            }
            if(count>=1)
            {
                System.out.println(arrstr[i]+ " Count : "+count);
            }
        }
    }
}