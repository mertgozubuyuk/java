package java_school.week03;

import java.util.Scanner;

public class P07_SayiKategorizeEdici {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] sayilar=new int[6];
        int i;

        for (i=0;i<sayilar.length;i++){
            System.out.println((i+1)+": sayıyı giriniz");
            sayilar[i]=input.nextInt();
        }

        int pozitif=0;
        int negatif=0;
        int sıfır=0;
        int pozitifToplam=0;
        int negatifToplam=0;

        for (i=0;i<sayilar.length;i++){
            if (sayilar[i]>0){
                pozitif++;
                pozitifToplam+=sayilar[i];
            }
            else if (sayilar[i]<0){
                negatif++;
                negatifToplam+=sayilar[i];
            }
            else {
                sıfır++;
            }
        }

        System.out.println(pozitif+ " adet pozitif sayı var.");
        System.out.println(negatif+ " adet negatif sayı var.");
        System.out.println(sıfır+ " adet sıfır var.");
        System.out.println("Pozitif sayıların toplamı:"+pozitifToplam);
        System.out.println("Negatif sayıların toplamı:"+negatifToplam);

    }
}
