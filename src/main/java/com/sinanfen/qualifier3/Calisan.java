package com.sinanfen.qualifier3;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {
    //defaultta çalışacak kodlar
    /*@Inject
    private PatronInterface patronInterface;*/

    //istediğim seçeneği seçiyorum- 1.seçenek
    /*@Inject
    @QualifierMultiple2(EFazlaSecenekler.BIRINCI)
    private PatronInterface patronInterface;*/


    //2.seçenek
    @Inject
    @QualifierMultiple2(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
