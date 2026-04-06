package java_school.week04.methods;

import java.util.Scanner;

public class P16_NSayısınaKadarOlanAsallariBulma {

    public static boolean asalBulan(int a){
        if(a<2){
            return false;
        }
        for (int i=2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;

    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        sayi= input.nextInt();

        for(int i=2;i<=sayi;i++){
            if(asalBulan(i)){
                System.out.println(i+"");
            }
        }
    }
}
