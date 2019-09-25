package com.company.models.users;

import com.company.models.users.User;

public class Client extends User {

    public Client(String email, String password) {
        super(email, password);
    }

    @Override
    public void deleteAccount(Boolean forceDelete) {

    }

}
