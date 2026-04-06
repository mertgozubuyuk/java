package java_school.week03.arrays;

import java.util.Scanner;

public class P03_NotYoneticisi {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] not=new int[5];

        for (int i=0;i<not.length;i++){
            System.out.println((i+1)+ ".notunuzu giriniz");
            not[i]=input.nextInt();
        }

        for (int i=0;i<not.length;i++){
            System.out.println((i+1)+".notunuz:"+(not[i]));
        }
    }

}
