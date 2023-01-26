package com.sinanfen.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;


@Named(value = "producetutor")
@ApplicationScoped
public class _02_Produces {

    @Produces //üretiyor - üretmeyi sağlar. başka bir yapı bunu tüketir
    public List<String> getList() {
        List<String> liste = new ArrayList<>();
        liste.add("html5");
        liste.add("css3");
        liste.add("javascript");
        liste.add("react");
        liste.add("angular");
        return liste;
    }
}
