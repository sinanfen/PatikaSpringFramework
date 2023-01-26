package com.sinanfen.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder


//cdi --> bean
@Named(value = "namedtuto")
@ApplicationScoped
public class _01_Named {
    private Long namedId;
    private String namedData ="Merhaba Named Cdi Bean";
}
