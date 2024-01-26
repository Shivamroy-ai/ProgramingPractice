package pattarn;

public class Pattern1 {

    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            for (int j=0; j<=8; j++) {
                if ((j>=4-i) && (j<=4+i)) {
                    System.out.print("*");
                }
                else {
                    System.out.println(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
