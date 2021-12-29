package bean;

public class LoginBean{
    private String id;
    private String password;
    private String name;
    private String loginTime;

    public LoginBean() {

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public void setPass(String password) {
        this.password = password;
    }

    public String getPass() {
        return this.password;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNamde() {
        return this.name;
    }
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getLoginTime() {
        return this.loginTime;
    }
}