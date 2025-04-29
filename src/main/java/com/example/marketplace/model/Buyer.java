package com.example.marketplace.model;

public class Buyer {
    private String login;
    private String password;
    private String nickname;
    private Category[] preferences;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Category[] getPreferences() {
        return preferences;
    }

    public void setPreferences(Category[] preferences) {
        this.preferences = preferences;
    }
}
