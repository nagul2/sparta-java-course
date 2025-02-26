package chapter3.exception.login;

public class User {
    private String id;
    private String password;

    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String login(String id, String password) {
        if (!(id.equals(this.id) && password.equals(this.password))) {
            throw new LoginException("유저 로그인 실패");
        }
        return id;
    }

    public String adminLogin(String id, String password) {
        if (!(id.equals("admin") && password.equals("1234"))) {
            throw new LoginException("관리자 로그인 실패");
        }
        return id;
    }

}
