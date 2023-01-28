package com.sinanfen.qualifier3;


@QualifierMultiple2(EFazlaSecenekler.IKINCI)
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "qualifier multiple enum:2: " + data;
    }
}
