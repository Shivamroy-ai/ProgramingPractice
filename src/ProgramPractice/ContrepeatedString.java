package ProgramPractice;

public class ContrepeatedString {


    public static void main(String[] args) {

        String str="java is a programing programing programing language. I like coding in java ";
        String []astr=str.split(" ");
        int cont=0;
        for (int i=0;i<str.length()-1;i++)
        {
            cont=0;
            for (int j=i;j<astr.length;j++)
            {
                if(astr[i].equals(astr[j]))
                {
                    cont++;
                }
            }
            if (cont>1)
            {
                System.out.println(astr[i]+" repeat "+cont);
            }
        }

    }
}
