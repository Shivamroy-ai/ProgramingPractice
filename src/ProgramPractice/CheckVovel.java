package ProgramPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVovel {

    public static void main(String[] args) {

        String str = "Welcome";

        Pattern pattern = Pattern.compile("[aeiou]]");
        Matcher matcher = pattern.matcher(str);

//       while (matcher.find())
//       {
//           System.out.println("Start Index = "+matcher.start()+"End value"+matcher.group());
//       }
        str = str.toLowerCase();
        int cout = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                ++cout;
            }
        }

        System.out.println("");
    }
}
