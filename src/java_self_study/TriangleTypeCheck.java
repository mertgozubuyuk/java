package java_self_study;

import java.util.Scanner;

public class TriangleTypeCheck {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int side1,side2,side3;

        System.out.println("Üç adet kenar bilgisi giriniz:");
        side1=input.nextInt();
        side2=input.nextInt();
        side3=input.nextInt();

        if (side1==side2 && side2==side3){
            System.out.println("Üçgeniniz eşkenardır");
        }
        else if(side1==side2 || side1==side3 || side2==side3){
            System.out.println("Üçgeniniz ikizkenar üçgendir");
        }
        else {
            System.out.println("Üçgeniniz çeşitkenar üçgendir");
        }
    }
}
