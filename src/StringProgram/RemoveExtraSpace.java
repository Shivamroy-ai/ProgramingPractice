package StringProgram;

public class RemoveExtraSpace {

    public static void main(String[] args) {

        String str="java is a programming language";

        System.out.println(str);
        int count=0;
        // Justified the String

        String newString=" ";
        String []splitstring=str.split(" ");

        for (int i=0;i<splitstring.length;i++)
        {
            newString=newString+splitstring[i].replace(splitstring[i].charAt(0),Character.toUpperCase(splitstring[i].charAt(0)))+" ";
        }
        System.out.println("New String = "+newString);
        // Count String
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
              {count++;}
        }
        System.out.println(count);
    }
}
