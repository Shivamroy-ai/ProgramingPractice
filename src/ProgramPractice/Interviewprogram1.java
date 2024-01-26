package ProgramPractice;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Interviewprogram1 {

    public static void main(String[] args) {

        String str="java is a programing language. I like coding in java ";
        int count =0;
        String []arrstr=str.split(" ");
        String rev="";
        List<String> list=new ArrayList();

        for (int i=0;i<arrstr.length;i++)
        {
            for (int j=arrstr[i].length()-1;j>=0;j--)
            {
                rev=rev+arrstr[i].charAt(j);
            }
            rev=rev+" ";
        }
        System.out.println(rev);
    }
}

//input[text()='hello']