package ProgramPractice;

public class SpacelNo {

    public static void main(String[] args) {

        int num=49;
        int sum=0;
        while (num>=0)
        {
            int rem=num%10;
            num=num/10;

            sum=(rem+num)+(rem*num);
            break;
        }
        System.out.println(sum);
    }
}
