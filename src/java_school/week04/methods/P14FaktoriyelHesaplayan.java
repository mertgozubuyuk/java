package java_school.week04.methods;

import java.util.Scanner;

public class P14FaktoriyelHesaplayan {

    public static int faktoriyelHesaplamaAracı(int n){
        int sonuc=1;
        for (int i=1;i<=n;i++){
            sonuc*=i;
        }
        return sonuc;
    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayı giriniz");
        sayi= input.nextInt();

        System.out.println(sayi+" sayısının faktoriyeli:"+faktoriyelHesaplamaAracı(sayi));
    }
}
