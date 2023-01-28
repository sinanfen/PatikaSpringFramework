package com.sinanfen.bean;


import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.servlet.http.HttpServletResponse;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;

@Named(value = "cdiBean")
@ManagedBean
@ViewScoped
@RequestScoped
@Getter
@Setter
public class JsfBean {

    private String patika;

    public JsfBean() {
        patika = "Spring Boot Eğitime Hoşgeldiniz";
    }
}