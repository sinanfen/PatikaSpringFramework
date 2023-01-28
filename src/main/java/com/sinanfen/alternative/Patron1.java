package com.sinanfen.alternative;


import jakarta.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {

    //@Alternative: aynı anda sadece 1 t
    @Override
    public String surum(String data) {
        return "patron 1: " + data;
    }
}
