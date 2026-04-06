package java_school.week04.methods;

import java.util.Scanner;

public class P13_AsalSayiBelirleyen {

    public static boolean asalBelirleme(int sayi){
        if (sayi<2){
            return false;
        }
        for (int i=2;i<sayi;i++){
            if(sayi%i==0){
                return false;
            }

        }
        return true;
    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi= input.nextInt();
        if(asalBelirleme(sayi)==true){
            System.out.println("Girdiğiniz sayı asaldır");
        }
        else {
            System.out.println("Girdiğiniz sayı asal değildir");
        }
    }
}
