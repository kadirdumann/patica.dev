import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double alan, cevre, r, pi = 3.14;
        Scanner scan = new Scanner(System.in);
        System.out.println("Daire yarıçaıpını giriniz : ");
        r = scan.nextDouble();

        alan = alanHesap(r, pi);
        cevre = cevreHesap(r, pi);
        System.out.println("Daire çevresi ; " + cevre + "\nDaire alanı ; " + alan);

    }
    public static double alanHesap(double r, double pi){
        //Alan Formülü : π * r * r;
        return pi * r * r;
    }
    public static double cevreHesap(double r, double pi){
        //Çevre Formülü : 2 * π * r;
        return 2 * pi * r;
    }
}
