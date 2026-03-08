package java_self_study;

import java.util.Scanner;

public class ProductSignCheck {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int number1,number2,product;

        System.out.println("İki adet sayı giriniz:");
        number1=input.nextInt();
        number2=input.nextInt();

        product=number1*number2;

        if (product>0){
            System.out.println("Sayıların çarpımları pozitiftir");
        }
        else if(product<0){
            System.out.println("Sayıların çarpımları negatiftir");
        }
        else {
            System.out.println("Sayıların çarpımı 0'dır");
        }

    }
}
