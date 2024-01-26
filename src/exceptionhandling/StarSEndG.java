package exceptionhandling;

public class StarSEndG {

    public static void main(String[] args) {

        String []arg={"SIF QA","Marketing","Sales","Admin","Supporting"};

             for(int i=0;i<arg.length;i++)
             {
                 char str=arg[i].charAt(0);
                 char end=arg[i].charAt(arg[i].length()-1);
                 if(end=='q'||str=='S')
                 {
                     System.out.println(arg[i]);
                 }


             }

        }


}

