package StringProgram;

import java.util.Arrays;

public class LargestCommonPrefixString {


    public static void main(String[] args) {

        String[] str = {"Shivankdjflam", "Shivanoiofja", "Shivanflk", "Shivanafdk", "Shivanajadf"};

        Arrays.sort(str);
        int strlength = str.length - 1;
        System.out.println(Arrays.toString(str));
        int max = Math.max(str[0].length(), str[strlength].length());

        int j = 0;
        int i;
        String prf = "";

  boolean flag=false;
        for (;j < max;) {

            for (i = 0; i < str.length; i++) {

               if(!(str[0].length()-1>=j)){break;}
                char endstr = str[strlength].charAt(j);
                char strchar = str[i].charAt(j);
                if (!(endstr == strchar))
                {
//                    flag=true;
                    break;
                }
            }
//            if(flag){break;}
            j++;
        }

        String pref = str[strlength].substring(0, j);
        System.out.println("Prefix String is = "+pref);
    }
}
