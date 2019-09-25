package com.company.models.users;

public abstract class User {

    protected String email, password;

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public abstract void deleteAccount(Boolean forceDelete);

    public void login(){
        System.out.println("Login User");
    }

    public void logout(){
        System.out.println("Logout User");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
