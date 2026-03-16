package java_school.week03;

public class P05_DiziCiftSayiYazdirma {
    static void main(String[] args) {
        int[] sayilar = {3, 8, 11, 20, 25, 42};
        int i;
        for (i=0;i<sayilar.length;i++){
            if (sayilar[i]%2==0){
                System.out.println(sayilar[i]);
            }
        }
    }
}
