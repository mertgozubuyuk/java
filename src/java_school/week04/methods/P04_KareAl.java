package java_school.week04.methods;

public class P04_KareAl {

    public static int kareAl(int sayi){
        return sayi*sayi;
    }

    static void main(String[] args) {
        int sonuc=kareAl(5);
        System.out.println("5'in karesi:"+sonuc);
    }
}
