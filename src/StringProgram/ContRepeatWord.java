package StringProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ContRepeatWord
{
    public static void main(String[] args) {

        String str="Java is a high level programing language Java is a high level programing language ";

        String []split=str.split(" ");
         int count =0;

        TreeSet<String> treeSet=new TreeSet();
        for (int i=0;i<split.length;i++)
        {
            count=0;
                 for (int j=0;j<split.length;j++)
                 {
                     if (split[j].equalsIgnoreCase(split[i]))
                     {
                         count++;
                     }
                 }
                 if (!treeSet.isEmpty() && treeSet.contains(split[i])) {
                     treeSet.remove(split[i]);
                     treeSet.add(count + "=" + split[i]);
                 }else {treeSet.add(count+" "+split[i]);}
        }
        System.out.println(treeSet);
    }
}
