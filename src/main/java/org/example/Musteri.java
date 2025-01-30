package org.example;

import java.util.ArrayList;
import java.util.List;

public class Musteri {
    private String isim;
    private List<Fatura> faturalar;

    public Musteri(String isim){
        this.isim=isim;
        this.faturalar=new ArrayList<>();
    }
    public void faturaEkle(Fatura fatura){
        faturalar.add(fatura);
    }
    public void faturaGoruntule(){
        System.out.println(isim+" adlı müşterinin faturaları:");
        for (Fatura fatura: faturalar){
            fatura.faturaBilgileriniGoster();
            System.out.println("Ödenme durumu: "+ (fatura.isOdendiMi() ? "Ödendi":"Ödenmedi"));
        }
    }
}
