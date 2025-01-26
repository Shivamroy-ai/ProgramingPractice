package pattarn;

public class Pattern10 {

    public static void main(String[] args) {

        for (int i=0;i<8;i++)
        {
            for (int j=0;j<9-i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
