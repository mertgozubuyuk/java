package java_school.week02;

public class P01_DonguleriTanima {
    static void main(String[] args) {

        System.out.println("---For Döngüsü---");
        for (int i=1;i<=10;i++){
            System.out.println(i+ "");
        }
        System.out.println("\n");

        System.out.println("---While Döngüsü---");
        int i=1;
        while(i<=10){
            System.out.println(i+ "");
            i++;
        }
        System.out.println("\n");

        System.out.println("---Do While Dögüsü");
        int j=1;
        do {
            System.out.println(j+ "");
            j++;
        }while(j<=10);
    }
}
