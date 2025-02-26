package chapter3.exception.login;

public class LoginException extends RuntimeException {
    public LoginException(String message) {
        super(message);
    }
}
