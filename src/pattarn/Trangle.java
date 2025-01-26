package pattarn;

public class Trangle {

    public static void main(String[] args) {

        int num=8;
       int cont=0;

        for(int i=1;i<8;i++)
        {
            if (i>4)
            {
                cont++;
            }

            if(i<5) {
                for (int j = 0; j <= num; j++) {
                    if (j > (num / 2) - i && j < (num / 2) + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            if(i>4) {

                for (int j = 0; j < num; j++) {
                    if (j > cont && j < 8 - cont) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }
}
