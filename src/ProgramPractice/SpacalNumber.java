package ProgramPractice;

public class SpacalNumber {

    public static void main(String[] args)
    {
        int num=49;
        int sum=0;
            int div=num%10;
            num=num/10;
             sum=(div+num)+(div*num);
             System.out.println(sum);
    }
}
