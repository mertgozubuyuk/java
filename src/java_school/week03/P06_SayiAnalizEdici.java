package java_school.week03;

import java.util.Scanner;

public class P06_SayiAnalizEdici {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] sayilar=new int[5];
        int i;

        for (i=0;i<sayilar.length;i++){
            System.out.println((i+1)+".sayıyı giriniz");
            sayilar[i]=input.nextInt();
        }

        int enBuyuk=sayilar[0];
        int enKucuk=sayilar[0];

        for (i=1;i<sayilar.length;i++){
            if (enBuyuk<sayilar[i]){
                enBuyuk=sayilar[i];
            }
            if (enKucuk>sayilar[i]){
                enKucuk=sayilar[i];
            }
        }

        int toplam=0;

        for (i=0;i<sayilar.length;i++){
            toplam+=sayilar[i];
        }

        float ortalama=toplam/5;

        System.out.println("En büyük sayı:"+enBuyuk);
        System.out.println("En küçük sayı:"+enKucuk);
        System.out.println("Ortalama:"+ortalama);
    }
}
