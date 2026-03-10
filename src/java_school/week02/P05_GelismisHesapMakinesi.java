package java_school.week02;

import java.util.Scanner;

public class P05_GelismisHesapMakinesi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim = -1;

        do {
            System.out.println("---Menü---");
            System.out.println("1-Toplama");
            System.out.println("2-Çıkarma");
            System.out.println("3-Çarpma");
            System.out.println("4-Bölme");
            System.out.println("0-Çıkış");

            System.out.print("Lütfen bir seçim yapınız(0-4):");
            secim = input.nextInt();

            if (secim == 0) {
                System.out.println("Programdan çıkış yapılıyor...");
                break;
            }

            System.out.println("Lütfen 1. sayıyı giriniz:");
            int sayi1 = input.nextInt();
            System.out.println("Lütfen 2. sayıyı giriniz:");
            int sayi2 = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Sonuç: " + (sayi1 + sayi2));
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Sonuç: " + (sayi1 - sayi2));
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Sonuç: " + (sayi1 * sayi2));
                    System.out.println("\n");
                    break;
                case 4:
                    System.out.println("Sonuç: " + (sayi1 / sayi2));
                    System.out.println("\n");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız");
                    System.out.println("\n");

            }
        } while (secim != 0);

    }
}
