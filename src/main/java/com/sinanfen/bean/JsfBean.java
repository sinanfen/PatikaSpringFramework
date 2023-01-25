package com.sinanfen.bean;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "cdiBean")
@RequestScoped
@Setter
@Getter
public class JsfBean {
    private String patika;

    public JsfBean() {
        this.patika = "Spring boot";
    }


}
