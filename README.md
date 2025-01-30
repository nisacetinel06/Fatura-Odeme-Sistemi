💡 Fatura Ödeme Sistemi
Bu proje, Java OOP (Nesne Yönelimli Programlama) prensiplerine uygun olarak geliştirilen bir fatura ödeme sistemidir. Kullanıcı, terminal üzerinden elektrik ve su faturalarını ödeyebilir, ödeme geçmişini görüntüleyebilir ve ödemelerini farklı yöntemlerle gerçekleştirebilir.

📌 Projede Kullanılan Kavramlar

✅ Soyutlama (Abstraction) → Fatura sınıfı soyut olup, tüm fatura türleri için ortak özellikleri içerir.
✅ Kalıtım (Inheritance) → ElektrikFaturasi ve SuFaturasi, Fatura sınıfından türetilmiştir.
✅ Polimorfizm (Polymorphism) → Faturalar, Fatura sınıfı üzerinden yönetilir ve her fatura türü kendine özgü bilgiler içerir.
✅ Kapsülleme (Encapsulation) → Musteri, Fatura gibi sınıflardaki değişkenler private/protected olarak tanımlanmıştır.
✅ Enum Kullanımı → OdemeYontemi enum’ı, ödeme yöntemlerini yönetmek için kullanılmıştır.

📂 Proje İçeriği

1️⃣ Sınıflar:

📌 Sınıf Adı	
🔍 Açıklama
Fatura	Soyut sınıf olup, faturaların ortak özelliklerini içerir.
ElektrikFaturasi	Elektrik faturası işlemleri için kullanılır.
SuFaturasi	Su faturası işlemleri için kullanılır.
Musteri	Kullanıcının fatura ödeme geçmişini tutar.
OdemeYontemi	Enum olarak tanımlanmış olup, ödeme yöntemlerini içerir.
Main	Kullanıcıdan veri alarak işlemleri yöneten ana sınıftır.

💻 Kullanım Senaryosu

1️⃣ Kullanıcı terminal üzerinden giriş yapar.
2️⃣ Ödeme yapmak istediği fatura türünü seçer.
3️⃣ Ödeme tutarını girer ve ödeme yöntemini belirler.
4️⃣ Ödeme tamamlanır ve fatura durumu güncellenir.
5️⃣ Kullanıcı dilerse ödeme geçmişini görüntüleyebilir.
6️⃣ İşlem tamamlandığında sistemden çıkış yapabilir.

![image](https://github.com/user-attachments/assets/7e30d0ba-bb4e-4608-b0c0-b1069e1c59fb)

