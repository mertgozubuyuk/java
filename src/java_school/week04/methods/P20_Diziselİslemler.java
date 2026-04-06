package java_school.week04.methods;

import java.util.Scanner;

public class P20_Diziselİslemler {

    //1.Metot:Diziyi küçükten büyüğe sıralar
    public static void diziSirala(int dizi[]){
        for (int i=0;i<dizi.length;i++){
            for(int j=i+1; j<dizi.length;j++){
                if(dizi[i]>dizi[j]){
                    int gecici=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=gecici;
                }
            }
        }
    }

    //2.Metot Diziyi tersten yazdırır
    public static void terstenYazdir(int dizi[]){
        for (int i=dizi.length-1;i>=0;i--){
            System.out.println(dizi[i]+"");
        }
        System.out.println();
    }

    //3.Metot:Tekrar eden sayı var mı
    public static boolean tekrarVarMi(int dizi[]){
        for(int i=0;i<dizi.length;i++){
            for (int j=i+1;j<dizi.length;j++){
                if(dizi[i]==dizi[j]){
                    return true;
                }
            }
        }

        return false;
    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayilar[]=new int[5];

        for (int i=0;i<sayilar.length;i++){
            System.out.println((i+1)+". sayıyı giriniz:");
            sayilar[i]=input.nextInt();
        }

        //Sıralama
        diziSirala(sayilar);
        System.out.println("Küçükten büyüğe sıralanmış hali: ");
        for(int i=0;i<sayilar.length;i++){
            System.out.println(sayilar[i]+" ");
        }

        System.out.println("------");

        //Ters Yazdırma
        System.out.println("Büyükten küçüğe sıralanmış hali:");
        terstenYazdir(sayilar);

        System.out.println("------");

        //Tekrar Kontrolü
        if (tekrarVarMi(sayilar)==true){
            System.out.println("Dizide tekrar eden sayı VAR");
        }
        else{
            System.out.println("Dizide tekrar eden sayı YOK");
        }
    }
}
