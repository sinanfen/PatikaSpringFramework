package com.sinanfen.bean;


import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named(value = "cdiBean")
@RequestScoped
@Getter @Setter
public class JsfBean {

    private String patika;

    public JsfBean() {
        patika="Spring Boot Eğitime Hoşgeldiniz";
    }
}