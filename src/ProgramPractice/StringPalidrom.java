package ProgramPractice;

public class StringPalidrom {
    public static void main(String[] args) {
        String str="abac";
        String str1="";
        for (int i=str.length()-1;i>=0;i--)
        {
            str1=str1+str.charAt(i);
        }
        if(str.equals(str1))
        {
            System.out.println("Number is Palindrom");
        }
    }
}
