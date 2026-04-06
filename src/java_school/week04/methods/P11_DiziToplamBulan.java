package java_school.week04.methods;

public class P11_DiziToplamBulan {

    public static int diziToplam(int dizi[]){
        int toplam=0;
        for (int i=0;i<dizi.length;i++){
            toplam+=dizi[i];
        }
        return toplam;

    }

    static void main(String[] args) {
        int sayilar[]={10,20,30,40};
        System.out.println(diziToplam(sayilar));
    }
}
