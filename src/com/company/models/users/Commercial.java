package com.company.models.users;

import com.company.AchatVenteInterface;

public class Commercial extends User implements AchatVenteInterface {

    public Commercial(String email, String password) {
        super(email, password);
    }

    @Override
    public void deleteAccount(Boolean forceDelete) {

    }


    @Override
    public void commander(String quoi) {
        System.out.println("Je commande " + quoi);
    }

    @Override
    public void vendre(String quoi) {

    }
}
