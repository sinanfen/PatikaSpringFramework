package com.sinanfen.qualifier3;


import jakarta.enterprise.inject.Default;

@Default
public class Patron1 implements PatronInterface {

    //@Alternative: aynı anda sadece 1 t
    @Override
    public String surum(String data) {
        return "Default data: " + data;
    }
}
