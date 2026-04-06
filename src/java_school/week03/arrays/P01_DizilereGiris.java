package java_school.week03.arrays;

public class P01_DizilereGiris {

    public static void main(String[] args) {
        // 1. ADIM: Boş bir "koli" oluştur (3 kişilik yer ayır)
        int[] numbers = new int[3];

        // 2. ADIM: İçine değerleri yerleştir (Adreslere göre)
        numbers[0] = 10; // İlk sıraya 10 koy
        numbers[1] = 20; // İkinci sıraya 20 koy
        numbers[2] = 30; // Üçüncü sıraya 30 koy

        // 3. ADIM: Bir değeri geri çağır (Ekranda gör)
        System.out.println("Birinci sayı: " + numbers[0]);
        System.out.println("İkinci sayı: " + numbers[1]);
        System.out.println("Üçüncü sayı: " + numbers[2]);

        System.out.println("----------------");

        // 1. ADIM: 3 kişilik bir "İsim Listesi" (Dizi) oluştur
        // String[] diyerek bu kolinin içine sadece metin girebilir diyoruz.
        String[] players = new String[3];

        // 2. ADIM: Oyuncuları adreslerine (indeks) göre yerleştir
        // Unutma: Saymaya yine 0'dan başlıyoruz!
        players[0] = "Immobile";     // 0. İndeks (1. sıradaki oyuncu)
        players[1] = "Rafa Silva";   // 1. İndeks (2. sıradaki oyuncu)
        players[2] = "Gedson";       // 2. İndeks (3. sıradaki oyuncu)

        // 3. ADIM: İstediğimiz oyuncuyu ismiyle çağıralım
        System.out.println("Takımın yıldızı: " + players[0]);
        System.out.println("Orta sahanın dinamosu: " + players[2]);

        // 4. ADIM: Tüm listeyi tek tek yazdırmak (Döngü ile)
        System.out.println("\n--- Maç Kadrosu ---");
        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". sıradaki oyuncu: " + players[i]);
        }
    }
}
