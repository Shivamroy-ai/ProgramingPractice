package ProgramPractice;

public class PrefectNo {

    public static void main(String[] args) {
        int num=10;
        int sum=0;
        for (int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.println(num==sum);
    }
}
