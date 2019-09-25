package com.company.models;

import com.company.AchatVenteInterface;

public class Fournisseur implements AchatVenteInterface {

    @Override
    public void commander(String quoi) {
        System.out.println("Je commande 5X " + quoi);
    }

    @Override
    public void vendre(String quoi) {

    }

}
