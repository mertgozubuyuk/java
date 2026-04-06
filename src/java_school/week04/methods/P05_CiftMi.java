package java_school.week04.methods;

public class P05_CiftMi {

    public static boolean ciftMi(int sayi){
        if(sayi%2==0){
            return true;
        }
            return false;
    }

    static void main(String[] args) {
        System.out.println("5 sayısı çift mi:"+ciftMi(5));
        System.out.println("4 sayısı çift mi:"+ciftMi(4));
    }
}
