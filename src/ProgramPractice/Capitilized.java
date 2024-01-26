package ProgramPractice;

public class Capitilized {


    public static void main(String[] args) {

        String str="java is programing language";

        String []splitstr=str.split(" ");
        String str1="";
        for (int i=0;i<splitstr.length;i++)
        {
            str1=str1+splitstr[i].replace(splitstr[i].charAt(0),Character.toUpperCase(splitstr[i].charAt(0)))+" ";
        }
        System.out.println("Enter ths String = "+str1.trim());
    }
}
