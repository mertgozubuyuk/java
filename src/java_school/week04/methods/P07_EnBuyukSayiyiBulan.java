package java_school.week04.methods;

public class P07_EnBuyukSayiyiBulan {

    public static int enBuyukSayiBulan(int a, int b){
        if(a>b){
            return a;
        }
        else {
            return b;
        }
    }

    static void main(String[] args) {
        System.out.println("En büyük sayı:"+enBuyukSayiBulan(4,6));
    }
}
