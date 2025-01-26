package pattarn;

public class Pattern {

    public static void main(String[] args)
    {
        int num=20;
        for (int i=0;i<=num/2;i++)
        {
            for (int j=0;j<=num;j++)
            {
                if(j>=(num/2)-i && j<=(num/2)+i)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
