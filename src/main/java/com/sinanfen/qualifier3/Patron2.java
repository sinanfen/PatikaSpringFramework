package com.sinanfen.qualifier3;


@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "qualifier multiple enum:1: " + data;
    }
}
