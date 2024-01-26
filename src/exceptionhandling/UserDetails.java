package exceptionhandling;

public class UserDetails implements  Comparable<UserDetails>{

    String usernam;
    int userid;

    public UserDetails(String usernam, int userid) {
        this.usernam = usernam;
        this.userid = userid;
    }

    public String getUsernam() {
        return usernam;
    }
    public void setUsernam(String usernam) {
        this.usernam = usernam;
    }

    public String toString()
    {
        return "|| Username\t"+usernam+"\tUserId"+userid+"||";
    }

    public int hashCode()
    {
        return userid;
    }

    @Override
    public int compareTo(UserDetails o) {
        return this.usernam.length() - this.usernam.length();
    }
}
