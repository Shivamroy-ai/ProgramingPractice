package StringProgram;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String takestring=scanner.next();

        String str="Hello";

        if(takestring.equalsIgnoreCase(str))
        {
            System.out.println(takestring);
        }
    }
}
