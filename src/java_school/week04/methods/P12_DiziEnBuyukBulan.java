package java_school.week04.methods;

public class P12_DiziEnBuyukBulan {

    public static int diziEnBüyükSayiBulma(int dizi[]){
        int enBuyuk=dizi[0];
        for (int i=1;i<dizi.length;i++){
            if (dizi[i]>enBuyuk){
                enBuyuk=dizi[i];
            }
        }
        return enBuyuk;
    }

    static void main(String[] args) {
        int sayilar[]={12,4,6,23,45};
        System.out.println("En büyük dizi elemanı:"+diziEnBüyükSayiBulma(sayilar));
    }
}
