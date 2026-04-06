package java_school.week04.methods;

import java.util.Scanner;

public class P17_OgrenciNotSistemi {

    public static double ortalamaHesaplama(int not[]){
        double toplam=0;
        for (int i=0;i<not.length;i++){
            toplam+=not[i];
        }
        double ortlama=toplam/5;
        return ortlama;
    }

    public static void harfNotu(int not[]){
        for (int i=0;i<not.length;i++){
            if(not[i]>=90&&not[i]<=100){
                System.out.println((i+1)+". öğrencinin harf notu A");
            }
            else if(not[i]>=80&&not[i]<=89){
                System.out.println((i+1)+". öğrencinin harf notu B");
            }
            else if(not[i]>=70&&not[i]<=79){
                System.out.println((i+1)+". öğrencinin harf notu C");
            }
            else if(not[i]>=60&&not[i]<=69){
                System.out.println((i+1)+". öğrencinin harf notu D");
            }
            else{
                System.out.println((i+1)+". öğrencinin harf notu F");
            }
        }
    }


    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] not=new int[5];
        for(int i=0;i<not.length;i++){
            System.out.println((i+1)+".öğrencinin notunu giriniz:");
            not[i]=input.nextInt();
        }
        System.out.println("5 öğrencinin ortalaması:"+ortalamaHesaplama(not));
        System.out.println("------");

        harfNotu(not);
        System.out.println("------");

        int gecti=0;
        int kaldı=0;

        for(int i=0;i<not.length;i++){
            if(not[i]>=60){
                gecti++;
            }
            else {
                kaldı++;
            }
        }

        System.out.println("Dersten geçen kişi sayısı:"+gecti);
        System.out.println("Dersten kalan kişi sayısı:"+kaldı);
    }
}
