package pattarn;

public class PatternTriangle {

    public static void main(String[] args) {

        for (int i=1;i<8;i++)
        {
            for (int j=0;j<i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
