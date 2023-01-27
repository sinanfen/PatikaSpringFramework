package com.sinanfen.alternative;


import jakarta.enterprise.inject.Alternative;

@Alternative
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "patron 2: " + data;
    }
}
