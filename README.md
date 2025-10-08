# Özgeçmiş PDF

Java ile özgeçmiş PDF dosyası oluşturan uygulama. Apache PDFBox kütüphanesi kullanarak profesyonel görünümlü CV oluşturur.

## Özellikler

- Kişisel bilgiler (isim, telefon, e-posta, adres)
- Profil fotoğrafı ekleme
- İş deneyimleri listesi
- Eğitim bilgileri
- Yetenekler bölümü

## Gereksinimler

- OpenJDK 25
- IntelliJ IDEA
- Apache PDFBox 2.0.35
- Apache FontBox 2.0.35
- Apache Commons Logging 1.2

## Kurulum

1. Projeyi klonlayın:
```bash
git clone https://github.com/NazliPalabiyik/Ozgecmis-PDF.git
```

2. Gerekli kütüphaneleri indirin:
   - [Apache PDFBox 2.0.35](https://pdfbox.apache.org/download.cgi)
   - [Apache Commons Logging 1.2](https://commons.apache.org/proper/commons-logging/download_logging.cgi)

3. IntelliJ IDEA'da kütüphaneleri ekleyin:
   - `File` → `Project Structure` → `Libraries`
   - `+` butonuna tıklayın
   - `pdfbox-2.0.35.jar`, `fontbox-2.0.35.jar` ve `commons-logging-1.2.jar` dosyalarını seçin

4. (Opsiyonel) `src` klasörüne `fotograf.jpg` dosyanızı ekleyin.

## Kullanım

1. `OzgecmisOlusturucu.java` dosyasını açın
2. Kendi bilgilerinizi girmek için aşağıdaki satırları düzenleyin:

```java
// Kişisel Bilgiler
yazi.showText("AYSE DEMIR");                      // İsminiz
yazi.showText("Telefon: +90 555 123 45 67");     // Telefon numaranız
yazi.showText("E-posta: ayse.demir@email.com");  // E-posta adresiniz
yazi.showText("Adres: Istanbul, Turkiye");       // Adresiniz
```

3. İş deneyimleri, eğitim ve yetenekler bölümlerini kendi bilgilerinizle güncelleyin
4. Programı çalıştırın (Run 'OzgecmisOlusturucu.main()')
5. Proje klasöründe `OzgecmisPDF.pdf` dosyası oluşturulacaktır

## Çıktı

Program başarıyla çalıştığında:
- Konsola `PDF olusturuldu: OzgecmisPDF.pdf` mesajı yazdırılır
- Proje ana dizininde PDF dosyası oluşturulur

## Proje Yapısı

```
Ozgecmis-PDF/
├── src/
│   ├── OzgecmisOlusturucu.java    # Ana program dosyası
│   └── fotograf.jpg                # Profil fotoğrafı (opsiyonel)
├── lib/                            # Kütüphane JAR dosyaları
│   ├── pdfbox-2.0.35.jar
│   ├── fontbox-2.0.35.jar
│   └── commons-logging-1.2.jar
└── OzgecmisPDF.pdf                 # Oluşturulan PDF (çalıştırdıktan sonra)
```

## Sorun Giderme

**"Fotograf bulunamadi" mesajı:**
- Fotoğraf dosyasının `src` klasöründe olduğundan emin olun
- Dosya adının tam olarak `fotograf.jpg` olmalı
- Bu mesaj programın çalışmasını engellemez, sadece PDF'de fotoğraf olmayacaktır

**"Class not found" hatası:**
- Tüm JAR dosyalarının Project Structure'a eklendiğini kontrol edin
- IntelliJ IDEA'yı yeniden başlatın
- `File` → `Invalidate Caches / Restart` deneyin

## Geliştirici

**Nazlı Palabıyık**
- GitHub: [@NazliPalabiyik](https://github.com/NazliPalabiyik)
- Proje Linki: [Özgeçmiş PDF](https://github.com/NazliPalabiyik/Ozgecmis-PDF.git)
