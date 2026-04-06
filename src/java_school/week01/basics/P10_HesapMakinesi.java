package java_school.week01.basics;

import java.util.Scanner;

public class P10_HesapMakinesi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Sayı alma kısmı
        System.out.print("Birinci sayıyı giriniz:");
        double sayi1=input.nextDouble();

        System.out.print("İkinci sayiyi giriniz:");
        double sayi2=input.nextDouble();

        //Menü
        System.out.println("---İşlem Menüsü---");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        System.out.print("Yapmak istediğiniz işlem için belirtilen rakama basınız(1-4):");
        int secici=input.nextInt();

        //Seçime göre sonuçlar
        switch (secici) {
            case 1:
                System.out.println("Sonuç:" +(sayi1+sayi2));
                break;
            case 2:
                System.out.println("Sonuç:" +(sayi1-sayi2));
                break;
            case 3:
                System.out.println("Sonuç:" +(sayi1*sayi2));
                break;
            case 4:
                System.out.println("Sonuç:" +(sayi1/sayi2));
                break;
            default:
                System.out.println("Hatalı bir seçim yaptınız! Lutfen tekrar deneyiniz.");
                break;
        }


    }
}