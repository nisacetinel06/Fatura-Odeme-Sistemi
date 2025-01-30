package org.example;

public abstract class Fatura {
    protected String musteriAdi;
    protected double tutar;
    protected boolean odendiMi;

    public Fatura(String musteriAdi,double tutar){
        this.musteriAdi=musteriAdi;
        this.tutar=tutar;
        this.odendiMi=false;
    }
    public abstract void faturaBilgileriniGoster();

    public void odemeYap(OdemeYontemi yontem) {
        if (!odendiMi) {
            this.odendiMi = true;
            System.out.println("Fatura ödendi! Ödeme yöntemi: " + yontem);
        } else {
            System.out.println("Fatura zaten ödenmiş.");
        }
    }
    public boolean isOdendiMi() {
        return odendiMi;
    }
}