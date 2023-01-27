package com.sinanfen.with_ioc_di;


public class Patron implements PatronInterface {

    @Override
    public String surum(String data) {
        return "sürüm " + data;
    }
}
