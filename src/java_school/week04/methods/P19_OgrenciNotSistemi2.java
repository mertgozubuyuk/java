package java_school.week04.methods;

import java.util.Scanner;

public class P19_OgrenciNotSistemi2 {

    public static int enBuyukNot(int not[]){
        int enBuyuk=not[0];
        for (int i=1;i<not.length;i++){
            if (not[i]>enBuyuk){
                enBuyuk=not[i];
            }
        }

        return enBuyuk;
    }

    public static int enKucukNot(int not[]){
        int enKucuk=not[0];
        for (int i=1;i<not.length;i++){
            if(not[i]<enKucuk){
                enKucuk=not[i];
            }
        }

        return enKucuk;
    }

    public static double ortalamaBulucu(int not[]){
        int toplam=0;
        for (int i=0;i<not.length;i++){
            toplam+=not[i];
        }
        double ortalama=toplam/5.0;
        return ortalama;
    }

    public static int gecenSayisi(int not[]){
        int gecenSayisi=0;

        for (int i=0;i<not.length;i++){
            if(not[i]>=60){
                gecenSayisi++;
            }
        }

        return gecenSayisi;
    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] not=new int[5];

        for (int i=0;i<not.length;i++){
            System.out.println((i+1)+". öğrencinin notunu giriniz");
            not[i]= input.nextInt();
        }

        System.out.println("En yüksek öğrenci notu:"+enBuyukNot(not));
        System.out.println("En düşük öğrenci notu:"+enKucukNot(not));
        System.out.println("Sınıfın not ortalaması:"+ortalamaBulucu(not));
        System.out.println("Dersten geçen sayısı:"+gecenSayisi(not));
        System.out.println("Dersten kalan sayısı:"+(not.length-gecenSayisi(not)));

    }
}
