package operater;

public class Increment_Decrement_Operater {


    public static void main(String[] args) {

        int a=12;
        int b=20;
        int c=++a;//13
        int d=c++;//13
         b++;//21
         --c;//12
         c--;//12
         int e=c+++d++; // 13+13 =25
        System.out.println(a); // 13
        System.out.println(b);//21
        System.out.println(c);//13
        System.out.println(d);//14
        System.out.println(e);//25

    }
}
