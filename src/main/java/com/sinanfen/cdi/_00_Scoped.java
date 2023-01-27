package com.sinanfen.cdi;

import jakarta.enterprise.context.*;
import jakarta.inject.Named;

import java.io.Serializable;

//Kapsam
//Projenin yaşam süresi
//scope performansı etkiler+ -
@Named
//@ApplicationScoped //bütün uygulama boyunca çalışır. bütün kullanıcılar için
//@RequestScoped //1 istek boyunca yaşar
//@SessionScoped //1 kullanıcı için yaşar ancak logout olduğu zaman
//@Dependent //bukalemun gibi. bulunudğu classın scope a göre davranıyor
//@ConversationScoped //belli istek boyunca yaşar
//@SessionScoped // Bean 1 instance olmasını salğamak için
public class _00_Scoped  {
}
