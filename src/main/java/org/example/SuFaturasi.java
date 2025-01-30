package org.example;

public class SuFaturasi extends Fatura{
    private double metreKupTuketim;

    public SuFaturasi(String musteriAdi,double tutar, double metreKupTuketim){
        super(musteriAdi,tutar);
        this.metreKupTuketim=metreKupTuketim;
    }

    @Override
    public void faturaBilgileriniGoster(){
        System.out.println("Su Faturası - Müşteri: "+musteriAdi+" Tutar: "+tutar+"TL"+" Tüketim Miktarı: "+metreKupTuketim+" m³");
    }
}
