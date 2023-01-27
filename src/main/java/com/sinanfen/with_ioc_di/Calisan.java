package com.sinanfen.with_ioc_di;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "withIoCandDICalisan")
@ApplicationScoped
public class Calisan {
    @Inject
    private PatronInterface patronInterface;

    //parametresiz ctor
    public Calisan() {
        //patronInterface = new Patron();
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
