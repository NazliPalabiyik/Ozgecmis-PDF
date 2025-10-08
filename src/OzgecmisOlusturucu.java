import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject;

public class OzgecmisOlusturucu {

    public static void main(String[] args) {

        // PDF belgesi oluştur
        PDDocument belge = new PDDocument();
        PDPage sayfa = new PDPage();
        belge.addPage(sayfa);

        try {
            // Sayfaya yazı yazmak için
            PDPageContentStream yazi = new PDPageContentStream(belge, sayfa);

            // Fotoğraf ekle
            try {
                PDImageXObject resim = PDImageXObject.createFromFile("fotograf.jpg", belge);
                yazi.drawImage(resim, 450, 650, 100, 120);
            } catch (Exception e) {
                System.out.println("Fotograf bulunamadi");
            }

            int y = 750;  // Yukarıdan aşağıya konum

            // İSİM
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 20);
            yazi.newLineAtOffset(50, y);
            yazi.showText("AYSE DEMIR");
            yazi.endText();
            y = y - 25;

            // TELEFON
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 11);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Telefon: +90 555 123 45 67");
            yazi.endText();
            y = y - 15;

            // E-POSTA
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 11);
            yazi.newLineAtOffset(50, y);
            yazi.showText("E-posta: ayse.demir@email.com");
            yazi.endText();
            y = y - 15;

            // ADRES
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 11);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Adres: Istanbul, Turkiye");
            yazi.endText();
            y = y - 30;

            // ÇIZGI
            yazi.moveTo(50, y);
            yazi.lineTo(550, y);
            yazi.stroke();
            y = y - 20;

            // İŞ DENEYİMLERİ BAŞLIK
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 14);
            yazi.newLineAtOffset(50, y);
            yazi.showText("IS DENEYIMLERI");
            yazi.endText();
            y = y - 25;

            // 1. İŞ
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 12);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Yazilim Gelistirici - ABC Teknoloji A.S.");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Ocak 2022 - Halen");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("- Java ve Spring Boot ile web uygulamalari gelistirme");
            yazi.endText();
            y = y - 12;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("- Veritabani tasarimi");
            yazi.endText();
            y = y - 25;

            // 2. İŞ
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 12);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Stajyer - XYZ Bilisim Ltd.");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Haziran 2021 - Aralik 2021");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("- Mobil uygulama gelistirme");
            yazi.endText();
            y = y - 12;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("- API entegrasyonu");
            yazi.endText();
            y = y - 25;

            // 3. İŞ
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 12);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Freelance Web Gelistirici");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Ocak 2020 - Mayis 2021");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("- Web siteleri tasarimi");
            yazi.endText();
            y = y - 12;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("- HTML, CSS, JavaScript");
            yazi.endText();
            y = y - 30;

            // ÇIZGI
            yazi.moveTo(50, y);
            yazi.lineTo(550, y);
            yazi.stroke();
            y = y - 20;

            // EĞİTİM BAŞLIK
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 14);
            yazi.newLineAtOffset(50, y);
            yazi.showText("EGITIM");
            yazi.endText();
            y = y - 25;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 12);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Bilgisayar Muhendisligi - Istanbul Universitesi");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("2017 - 2021");
            yazi.endText();
            y = y - 30;

            // ÇIZGI
            yazi.moveTo(50, y);
            yazi.lineTo(550, y);
            yazi.stroke();
            y = y - 20;

            // YETENEKLER BAŞLIK
            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA_BOLD, 14);
            yazi.newLineAtOffset(50, y);
            yazi.showText("YETENEKLER");
            yazi.endText();
            y = y - 25;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Java, Python, JavaScript");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Spring Boot, React, MySQL");
            yazi.endText();
            y = y - 15;

            yazi.beginText();
            yazi.setFont(PDType1Font.HELVETICA, 10);
            yazi.newLineAtOffset(50, y);
            yazi.showText("Turkce (Ana Dil), Ingilizce (Ileri Seviye)");
            yazi.endText();

            // Kapat
            yazi.close();

            // PDF'yi kaydet
            belge.save("OzgecmisPDF.pdf");
            belge.close();

            System.out.println("PDF olusturuldu: OzgecmisPDF.pdf");

        } catch (Exception hata) {
            System.out.println("Hata: " + hata.getMessage());
        }
    }
}