package java_school.week03;

public class P04_DiziEnBuyukSayiBulma {
    static void main(String[] args) {
        int[] sayilar = {12, 45, 7, 89, 34};
        int i;
        int enBuyuk=sayilar[0];
        for (i=1;i<sayilar.length;i++){
            if (enBuyuk<sayilar[i]){
                enBuyuk=sayilar[i];
            }
        }
        System.out.println("Dizideki en büyük sayı:" +enBuyuk);
    }
}
