package java_school.week02.loops;

import java.util.Scanner;

public class P06_SifreKilidi {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int dogruSifre=1234;
        int hak=3;
        int denemeSayisi=0;
        int girilenSifre;

        while(hak>0){
            System.out.println("Şifrenizi giriniz:");
            girilenSifre=input.nextInt();
            denemeSayisi++;
            if(girilenSifre==dogruSifre){
                System.out.println(denemeSayisi+ ". denemede doğru giriş yaptınız");
                break;
            }
            else {
                hak--;
                System.out.println("Hatalı giriş yaptınız.");
            }
            System.out.println("Kalan hakkınız "+hak);
        }
        System.out.println("Programdan çıkılıyor...");

    }
}
