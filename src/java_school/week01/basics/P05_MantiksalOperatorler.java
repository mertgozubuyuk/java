package java_school.week01.basics;

public class P05_MantiksalOperatorler {
    public  static void main(String[] args) {
        int x=5;
        int y=10;
        boolean kosul1=(x<y);
        boolean kosul2=(x>5);
        System.out.println("Kosul 1 doğru mu:" +(kosul1));
        System.out.println("Kosul2 doğru mu:" +(kosul2));
        System.out.println("Koşul1 ve koşul2 doğrumu:" +(kosul1&&kosul2));
        System.out.println("Kosul1 veya kosul2 doğrumu:" +(kosul1||kosul2));
        System.out.println("Kosul 1 doğru değil mi:" +(!kosul1));
        System.out.println("Kosul2 doğru değil mi:" +(!kosul2));

    }

}
