package StringProgram;

public class Revercestring {

    public static void main(String[] args) {

        String str="the quick brown fox jump over the lazy dog";
        String arrstr[]=str.split(" ");
        String str1="";
        for (int i=0;i<arrstr.length;i++)
        {
            String strsm="";
            for (int j=arrstr[i].length()-1;j>=0;j--)
            {
                 strsm=strsm+arrstr[i].charAt(j);
            }
            str1=str1+strsm+" ";
        }
        System.out.println(str1);
    }
}
