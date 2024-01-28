package StringProgram;

public class RevercelargeString {

    public static void main(String[] args) {

//        Input: s = “geeks quiz practice code”
//        Output: s = “code practice quiz geeks”
//        Input: s = “i love programming very much”
//        Output: s = “much very programming love i”

        String main="geeks quiz practice code";
        String []mainarr=main.split(" ");
        String rev ="";

        for (int i=mainarr.length-1;i>0;i--)
        {
            rev=rev+mainarr[i]+" ";
        }
        System.out.println(rev);
    }
}
