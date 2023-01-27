package com.sinanfen.alternative;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "alternativeDi")
@ApplicationScoped
public class Calisan {
    @Inject
    private PatronInterface patronInterface;

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
