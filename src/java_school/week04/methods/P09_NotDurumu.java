package java_school.week04.methods;

public class P09_NotDurumu {

    public static void notDurumu(int not){
        if (not>=50){
            System.out.println("Geçti");
        }
        else {
            System.out.println("Kaldı");
        }
    }

    static void main(String[] args) {
        notDurumu(38);
        notDurumu(56);
    }
}
