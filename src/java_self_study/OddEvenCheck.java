package java_self_study;

import java.util.Scanner;

public class OddEvenCheck {
    static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz:");
        number=input.nextInt();

        if (number%2==0){
            System.out.println("Girdiğiniz sayı çifttir");
        }
        else {
            System.out.println("Girdiğiniz sayı tektir");
        }

    }
}
