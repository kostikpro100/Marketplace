package com.example.marketplace.model;

public class Buyer {
    private String login;
    private String password;
    private String nickname;
    private Category[] preferences;

    public Buyer(String login, String password, String nickname, Category[] preferences) {
        this.login = login;
        this.password = password;
        this.nickname = nickname;
        this.preferences = preferences;
        GlobalProperties.addToGlobal(this);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getNickname() {
        return nickname;
    }

    public Category[] getPreferences() {
        return preferences;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPreferences(Category[] preferences) {
        this.preferences = preferences;
    }
}
