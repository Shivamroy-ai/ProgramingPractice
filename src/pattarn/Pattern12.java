package pattarn;

public class Pattern12 {

    public static void main(String[] args) {

        for (int i=0;i<8;i++)
        {
            for (int j=8;j>=0;j--)
            {
                if(i>=j)
                {
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
