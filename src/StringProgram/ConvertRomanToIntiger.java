package StringProgram;

public class ConvertRomanToIntiger {

    public static void main(String[] args) {

        String str="VIDCCLXXXVI";
        char []arrchar=str.toCharArray();
         int sum=0;
        for (int i=0;i<=arrchar.length-1;i++)
        {
           if((!(i==arrchar.length-1))&&romNum(arrchar[i])<romNum(arrchar[i+1]))
            {
                int num=romNum(arrchar[i+1])-romNum(arrchar[i]);
                    sum=sum+num;
                    i++;
            }
            else if((!(i+2>arrchar.length))&&romNum(arrchar[i])>=romNum(arrchar[i+1]))
            {
                int num=romNum(arrchar[i])+romNum(arrchar[i+1]);
                if(i==0&&sum==0)
                {
                    sum = sum + num;
                }
                else
                {
                    sum=(sum-romNum(arrchar[i]))+num;
                }
            }
            else if(i==0&& i==arrchar.length-1)
            {
                sum=sum+romNum(arrchar[i]);
            }

        }
        System.out.println(sum);
    }

    public static int romNum(char ch)
    {
        switch(ch)
        {
            case 'I' :
            {return 1;}
            case 'V' :
            {return 5;}
            case 'X':
            {
                return 10;
            }
            case 'L':
            {
                return 50;
            }
            case 'C':
            {
                return 100;
            }
            case 'D':
            {
                return  500;
            }
            case 'M':
            {
                return 1000;
            }
            default:{
                return 0;
            }
        }
    }
}
