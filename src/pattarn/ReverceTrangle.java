package pattarn;

public class ReverceTrangle {


    public static void main(String[] args) {

         int number=12;
        for (int i=0;i<number;i++)
        {
            for (int j=0;j<number;j++)
            {
                 if(j>=i && j<number-i)
                 {
                     System.out.print("*");
                 }
                 else {
                     System.out.print(" ");
                 }
            }
            System.out.println("");
        }
    }
}
