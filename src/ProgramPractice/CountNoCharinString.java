package ProgramPractice;

public class CountNoCharinString {

    public static void main(String[] args) {

        String str="Thisisajava";
         int count=0;
        for (int i=1;i<=str.length();i++)
        {
            count++;
        }
        System.out.println(str.length() +"and"+count);
    }
}
