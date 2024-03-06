package ProgramPractice;

public class DubblicateWord {

    public static void main(String[] args) {

        String str="The quick brown fox jump over toyThe quick brown fox jump over the lazy doy brown fox jump over the lazy doy";
        String strarr[]=str.split(" ");
        int count=0;
        for (int i=0;i<strarr.length;i++)
        {
            count=0;
            for (int j=i;j<strarr.length;j++)
            {
                if(strarr[i].equals(strarr[j]))
                {
                    ++count;
                }
            }
            if(count>1)
            {
                System.out.println(count +"=="+strarr[i]);
            }
        }
    }
}
