package java_school.week03.arrays;

import java.util.Scanner;

public class P06_KullanicidanDiziAl {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] sayilar=new int[5];
        for (int i=0;i<sayilar.length;i++){
            System.out.println((i+1)+". sayı giriniz");
            sayilar[i]=input.nextInt();
        }
        for (int i=0;i<sayilar.length;i++){
            System.out.println((i+1)+".sayınız:"+sayilar[i]);
        }
    }
}
