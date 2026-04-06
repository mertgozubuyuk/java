package java_school.week04.methods;

public class P10_SayiYazdirma {

    public static void sayiYazdirma(int sayi){
        for (int i=1;i<=sayi;i++){
            System.out.println(i);
        }
    }

    static void main(String[] args) {
        sayiYazdirma(5);
    }
}
