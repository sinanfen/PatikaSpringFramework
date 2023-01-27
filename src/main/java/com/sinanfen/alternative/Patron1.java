package com.sinanfen.alternative;


import jakarta.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements PatronInterface {

    //@Alternative:
    @Override
    public String surum(String data) {
        return "patron 1: " + data;
    }
}
