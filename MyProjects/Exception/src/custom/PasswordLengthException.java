package custom;

public class PasswordLengthException extends RuntimeException {
    public PasswordLengthException(){

    }
    public PasswordLengthException(String exception){
        System.out.println(exception);
    }
}
