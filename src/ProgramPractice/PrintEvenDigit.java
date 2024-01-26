package ProgramPractice;

public class PrintEvenDigit {

    public static void main(String[] args) {

        int num=436886;
        int sum=0;
        while (num>0)
        {
            int rem=num%10;
            num=num/10;
            if(rem%2!=0){
                System.out.println(rem);
                sum+=rem;
            }
        }
        System.out.println("Sum of Odd Digit = "+sum);
    }
}
