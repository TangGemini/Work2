package com.gemini.entity;

public class User {
    private String name;
    private String pwd;
    public String getName() {
        return name;
    }
    public String getPwd() { return  pwd; }
    public void setName(String name) {
        this.name = name;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    private String username;
    private String userpwd;
    public String getUsername() {
        return username;
    }
    public String getUserpwd() {
        return userpwd;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

}

