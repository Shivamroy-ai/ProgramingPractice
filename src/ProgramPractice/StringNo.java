package ProgramPractice;

public class StringNo {

    public static void main(String[] args) {

        int num=145;
        int tem=num;
        int sum=0;
        while (num>0)
        {
            int rum=num%10;
            num=num/10;
            sum=sum+fact(rum);
        }
        System.out.println(tem==sum?"Number is String ":"Number is not String ");
    }
    private static int fact(int rum) {

        int fact=1;
        while (rum>0)
        {
            fact=fact*rum;
            rum--;
        }
        return fact;
    }
}
