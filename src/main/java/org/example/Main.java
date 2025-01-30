package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Müşteri adı girin: ");
        String musteriAdi= scanner.next();

        Musteri musteri=new Musteri(musteriAdi);
        while (true){
            System.out.println("\n Yapmak istediğiniz işlemi seçin: ");
            System.out.println("1- Elektrik faturasını ödeyin.");
            System.out.println("2- Su faturasını ödeyin.");
            System.out.println("3- Fatura geçmişinizi görüntüleyin.");
            System.out.println("4- Çıkış yapın.");
            System.out.println("Seçiminiz: ");

            int secim= scanner.nextInt();
            scanner.nextLine();
             if (secim==4){
                 System.out.println("İşleminiz sonlandı iyi günler...");
                 break;
             }

             if (secim==1||secim==2){

                 System.out.println("Ödenecek tutarı girin: ");
                 double tutar=scanner.nextDouble();
                 System.out.println("Ödeme yöntemi girin (1-Kredi kartı, 2-Nakit, 3-Havale): ");
                 int odemeSecim=scanner.nextInt();

                 OdemeYontemi yontem;
                 switch (odemeSecim){
                     case 1: yontem = OdemeYontemi.KREDI_KARTI; break;
                     case 2: yontem = OdemeYontemi.NAKIT; break;
                     case 3: yontem = OdemeYontemi.HAVALE; break;
                     default:
                         System.out.println("Geçersiz seçim!");
                         continue;
                 }
                 if (secim == 1) {
                     System.out.print("Kullanılan Enerji (kW): ");
                     double kw = scanner.nextDouble();
                     Fatura elektrik = new ElektrikFaturasi(musteriAdi, tutar, kw);
                     musteri.faturaEkle(elektrik);
                     elektrik.odemeYap(yontem);
                 } else {
                     System.out.print(" Kullanılan Su (m³): ");
                     double su = scanner.nextDouble();
                     Fatura suFaturasi = new SuFaturasi(musteriAdi, tutar, su);
                     musteri.faturaEkle(suFaturasi);
                     suFaturasi.odemeYap(yontem);
                 }
             }
             else if (secim == 3) {
                 musteri.faturaGoruntule();
             }
             else {
                 System.out.println("Geçersiz giriş! Tekrar deneyin.");
             }
        }
        scanner.close();
             }
        }
