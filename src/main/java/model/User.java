package model;

import java.util.Objects;

public class User implements Entity{
    private static final long serialVersionUID = 1805304021099911999L;
    private int id;
    private String login;
    private String password;

    @Override
    public int getId() { return 0; }

    @Override
    public void setId(int id) { this.id = id; }

    public String getLogin() { return login; }
    public void setLogin(String login) { this.login = login; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public User(){}

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public static class Builder {
        private int id;
        private String login;
        private String password;

        public Builder setId(int id) { this.id = id; return this; }

        public Builder setLogin(String login) { this.login = login; return this; }

        public Builder setPassword(String password) { this.password = password; return this; }

        public User build() { return new User(id, login, password); }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && login.equals(user.login) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, password);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
