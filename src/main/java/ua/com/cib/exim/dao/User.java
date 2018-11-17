package ua.com.cib.exim.dao;


import java.util.Objects;

public class User {
    private String login;
    private String name;
    private String encrypt;
    private String decrypt;
    private String domain;

    public User() {
    }

    public User(String login, String decrypt) {
        this.login = login;
        this.decrypt = decrypt;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(String encrypt) {
        this.encrypt = encrypt;
    }

    public String getDecrypt() {
        return decrypt;
    }

    public void setDecrypt(String decrypt) {
        this.decrypt = decrypt;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", encrypt='" + encrypt + '\'' +
                ", decrypt='" + decrypt + '\'' +
                ", domain='" + domain + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(getLogin(), user.getLogin()) &&
                Objects.equals(getDomain(), user.getDomain());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLogin(), getDomain());
    }
}
