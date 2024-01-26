package pattarn;

public class Pattern7 {


    public static void main(String[] args) {
        int num=8;

        for (int i=0;i<num;i++)
        {
            for (int j=num;j>0;j--)
            {
                if(j<=i)
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
