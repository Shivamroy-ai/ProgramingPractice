package ProgramPractice;

public class PrintEachDigitNo {

    public static  void main(String []arg)
    {
        int num=79078;
        int rev=0;
        boolean flag=false;
        while (num>0)
        {
            int rem=num%10;
            num=num/10;
if(flag==false){rev=(rev*10)+rem;}
           if(num<=0||flag)
           {

               if(flag==false){ num=rev;flag=true;continue;}
               System.out.println(" Value of Each Digit = "+rem);
           }
        }
    }
}
