package com.sinanfen.qualifier;

public interface PatronInterface {

    //@Qualifier: aynı anda birden fazla proje aktif, ancak default olarak çalışacak projeyi seçebiliyoruz.
    public String surum(String data);
}
