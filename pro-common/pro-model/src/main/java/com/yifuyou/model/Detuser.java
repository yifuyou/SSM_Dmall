package com.yifuyou.model;

public class Detuser extends User {
    String mobile;
    String email;

    public Detuser(String name,String mobile, String email) {
        this.userName=name;
        this.mobile = mobile;
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
