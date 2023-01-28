package com.sinanfen.qualifier;


@QualifierMultiple
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "qualifier multiple 1: " + data;
    }
}
