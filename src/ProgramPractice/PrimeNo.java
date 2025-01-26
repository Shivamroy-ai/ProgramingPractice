package ProgramPractice;

public class PrimeNo {


    public static void main(String[] args) {

        int num=10;
        int count=0;
        for (int i=2;i<=num;i++)
        {
            if(num%1==0&& num%i==0)
            {
                count++;
            }
        }

        String s = !(count > 1) ? "Prime Number" : "Not a Prime Number";
        System.out.println(s);

    }
}
