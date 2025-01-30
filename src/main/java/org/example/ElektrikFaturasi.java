package org.example;

public class ElektrikFaturasi extends Fatura {
    private double kwTuketim;

    public ElektrikFaturasi(String musteriAdi,double tutar, double kwTuketim){
        super(musteriAdi,tutar);
        this.kwTuketim=kwTuketim;
    }
    @Override
    public void faturaBilgileriniGoster(){
        System.out.println("Elektrik Faturası - Müşteri: "+musteriAdi+" Tutar: "+tutar+"TL"+" Tüketim Miktarı: "+kwTuketim+" kW");
    }
}
