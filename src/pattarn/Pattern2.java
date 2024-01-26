package pattarn;

public class Pattern2 {

    public static void main(String[] args) {

        int ch=64;
        for (int i=0;i<8;i++)
        {
            for (int j=0;j<8;j++)
            {
                if(j<=i)
                {
                    System.out.print((char) ch);
                }
            }
            System.out.println(" ");
        }
    }
}
