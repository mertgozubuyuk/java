package java_self_study;

import java.util.Scanner;

public class LeapYearCheck {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int year;

        System.out.print("Lütfen artık yıl kontrolü için yıl bilgisini giriniz:");
        year=input.nextInt();

        if((year%400==0) || (year%4==0 && year%100!=0)){
            System.out.println(year+ " yılı artık yıldır");
        }
        else {
            System.out.println(year+ " yılı artık yıl değildir");
        }
    }
}
