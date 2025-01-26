package ProgramPractice;

import java.util.Stack;

public class PrintEachDigitofNumber {

    public static void main(String[] args) {

        int number=563578;

        int div=0;
        int rem=0;

        Stack<Integer> stack=new Stack<>();

        while (number>0)
        {
            div=number%10;
            stack.push(div);
             number=number/10;
        }
         while (!stack.isEmpty())
         {
             System.out.print(stack.pop());
         }

    }
}
