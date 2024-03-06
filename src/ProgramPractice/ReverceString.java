package ProgramPractice;

public class ReverceString {

    public static void main(String[] args) {

        String str="Java is a High Level Programing language.";

        String arrstr[]=str.split(" ");
        str="";
        for (int j=0;j<arrstr.length-1;j++)
        {
            for (int i =arrstr[j].length()-1; i >=0; i--)
            {
                str = str +arrstr[j].charAt(i);
            }
            str=str+" ";
        }
        System.out.println("Reverse String = " + str);
    }
}
