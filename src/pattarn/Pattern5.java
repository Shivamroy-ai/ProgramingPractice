package pattarn;

public class Pattern5 {
    public static void main(String[] args) {

        int num=8;

        for (int i=0;i<num;i++)
        {
            for (int j=num-i;j>=0;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
