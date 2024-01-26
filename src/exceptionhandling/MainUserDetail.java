package exceptionhandling;

import java.util.*;

public class MainUserDetail {

    public static void main(String[] args) {

        ArrayList<UserDetails> userList=new ArrayList<>();

        userList.add(new UserDetails("Shivdfgfghjklfghjklfghjkhjkam",1));
        userList.add(new UserDetails("Maghyank",22));
        userList.add(new UserDetails("Laldfghjklhgfghjkit",3));
        userList.add(new UserDetails("Pi",0));

        Iterator iterable=  userList.iterator();

        while (iterable.hasNext())
        {
            System.out.println(iterable.next());
        }

        System.out.println(userList.get(3).getUsernam().contains("Pryanshi"));
        userList.get(3).setUsernam("Shivam Pal");

        try
        {
            if(!userList.get(3).getUsernam().contains("Pryanshi")) {
                throw new UserNotFountException();
            }
        }
        catch (UserNotFountException e)
        {
            e.getMessage();
        }
        finally {
            System.out.println(userList.get(1).hashCode());
        }
        System.out.println(userList);
        Collections.sort(userList);
        System.out.println(userList);



    }
}
