package Interview;

import java.util.Scanner;

public class ReverceTrangle {


    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Plese Enter number");

        int num=scanner.nextInt();

        int num1=num;
        for (int i=0;i<num;i++)
        {

            for (int j=0;j<num;j++)
            {
                if(j>i && j<num1-i)
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}
