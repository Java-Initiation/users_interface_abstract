package com.company.models.users;

import com.company.models.users.User;

public class Admin extends User {

    private boolean superAdminLevel;

    public Admin(String email, String password, boolean superAdminLevel) {
        super(email, password);
        this.superAdminLevel = superAdminLevel;
    }

    public void enterInTheMatrix(){
        if (superAdminLevel)
            System.out.println("Enter in the Matrix");
        else
            System.out.println("Impossible because your are not Super Admin");
    }

    @Override
    public void deleteAccount(Boolean forceDelete) {

    }

    @Override
    public void login() {
        System.out.println("Login spécial admin");
        System.out.println("email : " + super.email);
        System.out.println("email : " + super.password);
    }

}
