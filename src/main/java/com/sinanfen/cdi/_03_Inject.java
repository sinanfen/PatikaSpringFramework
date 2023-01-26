package com.sinanfen.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.util.List;

@Named(value = "injecttuto")
@ApplicationScoped
public class _03_Inject {


    public List<String> getTuketen() {
        return tuketen;
    }

    //Inject Tuketen- produces classındaki veriyi tüketir.
    @Inject
    List<String> tuketen;
}
