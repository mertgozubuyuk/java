package java_school.week02.loops;

import java.util.Random;
import java.util.Scanner;

public class P08_SayiTahminOyunu2 {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rastgele=new Random();
        int tutulanSayi=rastgele.nextInt(100)+1;
        int tahmin;
        int hak=5;
        int deneme=0;

        while(hak>0){
            System.out.print("Lütfen bir sayı giriniz:");
            tahmin=input.nextInt();
            deneme++;
            hak--;
            if(tahmin==tutulanSayi){
                System.out.println(deneme+ ". denemede bildiniz,tebrikler");
                break;
            }
            else if(tutulanSayi<tahmin){
                System.out.println("Lütfen daha küçük bir sayı deneyiniz");
            }
            else{
                System.out.println("Lütfen daha büyük bir sayı deneyiniz");
            }
            if(hak>0){
                System.out.println(hak+ " hakkınız kaldı\n");
            }
        }
        System.out.println("Tutulan sayi "+tutulanSayi);
        System.out.println("Oyun bitti.Programdan çıkılıyor...");

    }
}
