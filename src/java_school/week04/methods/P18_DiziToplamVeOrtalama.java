package java_school.week04.methods;

import java.util.Scanner;

public class P18_DiziToplamVeOrtalama {

    public static void yazdir(int sayi[]){
        for (int i=0;i<sayi.length;i++){
            System.out.println((i+1)+".sayımız="+(sayi[i]));
        }
    }

    public static int toplamaAracı(int sayi[]){
        int toplam=0;
        for (int i=0;i<sayi.length;i++){
            toplam+=sayi[i];
        }
        return toplam;
    }

    public static double ortalamaAracı(int toplam){
        double ortalama=toplam/5.0;
        return ortalama;
    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] sayi= new int[5];

        for (int i=0;i<sayi.length;i++){
            System.out.println((i+1)+".sayıyı giriniz");
            sayi[i]=input.nextInt();
        }
        yazdir(sayi);
        System.out.println("Giridiğiniz sayıların toplamı:"+toplamaAracı(sayi));
        System.out.println("Girdiğiniz sayıların ortalaması:"+ortalamaAracı(toplamaAracı(sayi)));

    }
}
