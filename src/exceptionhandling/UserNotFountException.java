package exceptionhandling;

public class UserNotFountException extends  NullPointerException{

    UserNotFountException()
    {
        System.out.println("User Name InValid Exception");
    }

}
