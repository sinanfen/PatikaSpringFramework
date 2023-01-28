package com.sinanfen.qualifier2;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifierCdi")
@ApplicationScoped
public class Calisan {
    //defaultta çalışacak kodlar
  /*  @Inject
    private PatronInterface patronInterface;*/

    @Inject
    @QualifierMultiple
    private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
