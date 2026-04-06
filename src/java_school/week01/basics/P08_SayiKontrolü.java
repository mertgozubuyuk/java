package java_school.week01.basics;

import java.util.Scanner;

public class P08_SayiKontrolü {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Lutfen bir sayi giriniz:");
        int sayi=input.nextInt();

        if (sayi > 0) {
            System.out.println("Sayınız pozitiftir");
        }
        else if (sayi==0) {
            System.out.println("Sayınız sıfırdır");
        }
        else {
            System.out.println("Sayınız negatiftir");
        }

    }
}
