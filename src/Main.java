import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double hipotenus;
        Scanner inp = new Scanner(System.in);

        System.out.println("Kenarlardan birini giriniz: ");
        kenar1 = inp.nextInt();

        System.out.println("Diğer kenarı giriniz: ");
        kenar2 = inp.nextInt();

        System.out.println("Hipotenüs Uzunluğu: ");
        hipotenus = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));
        System.out.println(hipotenus);




    }
}