package java_school.week03;

public class P02_DiziElemanToplama {
    static void main(String[] args) {
        int[] sayilar={1,2,3,4,5};
        int toplam=0;
        for (int i=0;i<sayilar.length;i++){
            toplam+=sayilar[i];
        }
        System.out.println("Dizinin elemanları toplamı:"+toplam);
    }
}
