package pattarn;

public class MidTrangle {

    public static void main(String[] args) {

        for (int i=0;i<4;i++)
        {
            for (int j=0;j<12;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        int num=12;
        for (int i=0;i<num;i++)
        {
            for (int j=0;j<num;j++)
            {
                if(j<(num/2)-i || j>(num/2)+i)
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
