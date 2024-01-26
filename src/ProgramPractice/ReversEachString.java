package ProgramPractice;

public class ReversEachString {

    public static void main(String[] args) {

        String name="Hi Hello good Morning";
        String rev="";
        String []arrname=name.split(" ");

        for (int i=0;i<arrname.length;i++)
        {
            rev=rev+" ";
            for (int j=arrname[i].length()-1;j>=0;j--)
            {
                rev=rev+arrname[i].charAt(j);
            }
        }
        System.out.println(rev);
    }
}
