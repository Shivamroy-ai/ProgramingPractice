package ArrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class StoreIntegerPring {

    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);

        Integer []integers=new Integer[6];

        System.out.println(integers.length);

        for (int i=0;i<integers.length;i++)
        {
            integers[i]=scanner.nextInt();
        }

        System.out.println(Arrays.toString(integers));

    }
}
