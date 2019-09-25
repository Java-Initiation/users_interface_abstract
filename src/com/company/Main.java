package com.company;

import com.company.models.users.Admin;
import com.company.models.users.Commercial;
import com.company.models.users.User;

public class Main {

    public static void main(String[] args) {

        Admin admin = new Admin("test@test.com", "password", true);
        Commercial commercial = new Commercial("test2@test.com", "password");

        isAdmin(admin);
        isAdmin(commercial);

    }

    public  static void isAdmin(User user){

        if (user instanceof Admin){
            System.out.println(user.getEmail() + " est un admin");
            ((Admin) user).enterInTheMatrix();
        }
        else
            System.out.println(user.getEmail() + " n'est pas un admin");

    }

}
