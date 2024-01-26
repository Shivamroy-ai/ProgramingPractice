package ProgramPractice;

public class addNumber {


    public static void main(String[] args) {

//        addNumberfun();
        printDigitNum();

    }

    private static void printDigitNum() {

        int num = 7868743;
        int sum = 0;
        boolean rev = false;
        int i=0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = (sum * 10) + rem;
            if(num<=0&&i==0)
            {
                i++;
                num=sum;
                sum=0;
                rev=true;
                continue;
            }
            if(rev)
            {
                System.out.println(rem);
            }
        }

        }

    }

