package java_self_study;

import java.util.Scanner;

public class EqualityCheck {
    static void main(String[] args) {
        int number1,number2;
        Scanner input=new Scanner(System.in);

        System.out.println("İki adet sayı giriniz:");
        number1=input.nextInt();
        number2= input.nextInt();

        if (number1==number2){
            System.out.println("Girdiğiniz sayılar birbirine eşittir");
        }
        else {
            System.out.println("Girdiğiniz sayılar birbirine eşit değildir");
        }
    }
}
