package java_school.week02;

import java.util.Scanner;

public class P04_Menu {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int secim;
        do{
            System.out.println("---Menü---");
            System.out.println("1-Merhaba Yaz");
            System.out.println("0-Çıkış");

            System.out.println("--Lütfen bir seçim yapınız--");
            secim=input.nextInt();

            if(secim==1){
                System.out.println("Merhaba\n");
            }
        }while (secim!=0);
    }
}
