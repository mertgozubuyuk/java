package java_school.week04.methods;

import java.util.Scanner;

public class P15_KupalAl {

    public static int kupAl(int n){
        return n*n*n;
    }

    static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi;
        System.out.println("Bir sayı giriniz");
        sayi=input.nextInt();
        System.out.println(sayi+" sayısının küpü:"+kupAl(sayi));
    }
}
