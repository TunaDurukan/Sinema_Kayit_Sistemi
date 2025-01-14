# 🎥 Sinema Kayıt Sistemi

Bu proje, sinema salonları, filmler ve müşteriler arasında ilişkileri yönetmek için geliştirilmiş bir konsol uygulamasıdır. Sistem, müşteri, film ve salon yönetimi gibi temel işlevsellikler sunar.

## 🛠️ Özellikler

- **Müşteri Yönetimi:**
  - Müşteri kaydetme, silme, güncelleme ve listeleme.
  - Müşteriye film atama.
- **Sinema Salonu Yönetimi:**
  - Salon ekleme, silme, güncelleme ve listeleme.
  - Salona film atama.
- **Film Yönetimi:**
  - Film ekleme, silme, güncelleme ve listeleme.
  - Filmleri salona atama.

## 📂 Proje Yapısı

### Sınıflar ve Arayüzler

1. **BaseEntity.java**:
   - `id` ve `adi` özelliklerini içeren temel sınıf.
   - Tüm diğer varlıklar bu sınıfı genişletir.

2. **Musteri.java**:
   - Müşteri bilgilerini (ad, telefon, e-posta) ve müşterinin izlemek istediği filmi içerir.
   - Müşteri yönetimi işlevlerini (ekleme, silme, güncelleme) uygular.

3. **Film.java**:
   - Film bilgilerini (ad, tür, süre) içerir.
   - Filmlerin hangi salonda oynatıldığını takip eder.
   - Film yönetimi işlevlerini (ekleme, silme, güncelleme) uygular.

4. **Salon.java**:
   - Salon bilgilerini (kapasite, oynatılan film) içerir.
   - Salon yönetimi işlevlerini (ekleme, silme, güncelleme) uygular.

5. **IKayit.java**:
   - Kayıt ekleme, silme ve güncelleme işlemleri için standart bir arayüz sağlar.

6. **Main.java**:
   - Tüm işlevlerin birleştirildiği ana sınıf.
   - Kullanıcı etkileşimini sağlar ve menüler aracılığıyla yönetimi gerçekleştirir.

## 🚀 Kullanım

1. Proje dosyalarını bilgisayarınıza indirin.
2. Bir Java IDE'sinde açın (ör. IntelliJ IDEA, Eclipse).
3. `Main.java` dosyasını çalıştırın.
4. Konsolda sunulan menülerden seçim yaparak sistemi kullanın.

### Ana Menü

- **1- Müşteri Yönetimi:** Müşteri ekleme, silme, güncelleme ve listeleme.
- **2- Sinema Salonu Yönetimi:** Salon ekleme, silme, güncelleme ve listeleme.
- **3- Film Yönetimi:** Film ekleme, silme, güncelleme ve listeleme.
- **0- Çıkış:** Uygulamadan çıkış.

## 📌 Amaç

Bu proje, Pirireis Üniversitesi'nde almış olduğum Nesneye Dayalı Programlama dersinin vize projesidir. Sistem, dinamik bir yapı üzerine kurulmuş olup, gerçek hayattaki yönetim ihtiyaçlarına yönelik bir simülasyon sağlar.
