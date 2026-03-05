package java_school.week01;

import java.util.Scanner;

public class P07_ResitlikKontrolu {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Yaşınızı giriniz:");
        int yas=input.nextInt();

        if(yas<18){
            System.out.println("Reşit değilsiniz");
        }
        else {
            System.out.println("Reşitsiniz");
        }

    }
}
