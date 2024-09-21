package com.ecommerce.model;

public class RegModel {
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
    
    public RegModel(String fname,String lname, String email,String username,String password) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.password=password;
    }

    public String getfName() {
        return fname;
    }

    public void setfName(String fname) {
        this.fname = fname;
    }

    public String getlName() {
        return lname;
    }

    public void setlName(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public String toString() {
        return "RegModel [First Name = " + fname +", Last Name = " + lname + ", email = " + email +", username = " + username + ", password = " + password+ "]";
    }
}
