package StringProgram;

public class ReverceStringValue {

    public static void main(String[] args) {

        String str="Shivam";
        String rev="";
        char []arr=str.toCharArray();
        for (int i=arr.length-1;i>=0;i--)
        {
            rev=rev+arr[i];
        }
        System.out.println(rev);
    }
}
