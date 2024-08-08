package Interview;

public class ReverceEachWordinString {
    public static void main(String[] args) {

        String str="This is my book";
        String str1="";

        String []splstr=str.split(" ");

        for (int i=0;i<splstr.length;i++)
        {
            for (int j=splstr[i].length()-1;j>=0;j--)
            {
                 str1=str1+splstr[i].charAt(j);
            }
            str1=str1+" ";
        }
        System.out.println("Reverse String = "+str1);
    }

}
