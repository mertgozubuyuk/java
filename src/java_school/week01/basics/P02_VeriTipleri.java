package java_school.week01.basics;

public class P02_VeriTipleri {
    public static void main(String[] args) {

        // --- 1. TAM SAYILAR ---
        byte enKucukTamSayi = 127;           // 8 bit: -128 ile 127 arası
        short kisaTamSayi = 32767;          // 16 bit
        int tamSayi = 2147483647;           // 32 bit (En çok kullanılan)
        long buyukTamSayi = 9223372036854775807L; // 64 bit (Sonuna L eklenir)

        // --- 2. ONDALIKLI SAYILAR ---
        float ondalikli1 = 3.14f;           // 32 bit (Sonuna f eklenir)
        double ondalikli2 = 3.1415926535;   // 64 bit (Daha hassas, varsayılan)

        // --- 3. KARAKTER VE MANTIKSAL ---
        char tekKarakter = 'A';             // Tek tırnak kullanılır
        boolean dogruMu = true;             // Sadece true veya false

        // --- 4. METİNSEL (REFERANS TİP) ---
        String mesaj = "Java Öğreniyorum!"; // Çift tırnak kullanılır

        // EKRANA YAZDIRMA
        System.out.println("--- Sayısal Tipler ---");
        System.out.println("Byte Değeri: " + enKucukTamSayi);
        System.out.println("Integer Değeri: " + tamSayi);
        System.out.println("Long Değeri: " + buyukTamSayi);

        System.out.println("\n--- Ondalıklı Tipler ---");
        System.out.println("Float: " + ondalikli1);
        System.out.println("Double: " + ondalikli2);

        System.out.println("\n--- Diğer Tipler ---");
        System.out.println("Karakter: " + tekKarakter);
        System.out.println("Mantıksal: " + dogruMu);
        System.out.println("Metin: " + mesaj);
    }
}