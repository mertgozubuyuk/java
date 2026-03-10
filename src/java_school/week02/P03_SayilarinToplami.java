package java_school.week02;

import java.util.Scanner;

public class P03_SayilarinToplami {
    static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n;
        int toplam=0;
        System.out.print("Lütfen bir sayi giriniz:");
        n=input.nextInt();

        int i=1;
        while(i<=n){
            toplam+=i;
            i++;
        }
        System.out.println("1'den " +n+ "kadar olan sayiların toplamı:"+toplam);
    }
}
