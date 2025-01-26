package pattarn;

public class PrintNumberPattern
{
    public static void main(String[] args)
    {
        for (int i=0;i<8;i++)
        {
            for (int j=0;j<8;j++)
            {
                int num=65+j;
                System.out.print((char) num);
            }
            System.out.println();
        }
    }
}
