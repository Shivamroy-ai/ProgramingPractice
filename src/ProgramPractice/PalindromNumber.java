package ProgramPractice;

public class PalindromNumber {
    public static void main(String[] args) {

        int rev,palNum=313;
        rev=palNum;
        int div=0;
        int sum=0;

        while (palNum>0)
        {
            div=palNum%10;
            palNum=palNum/10;
            sum=(sum*10)+div;
        }
        if(sum==rev)
        {
            System.out.println(sum);
        }
    }
}
