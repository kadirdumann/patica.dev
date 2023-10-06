import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14 ,
                elma = 3.67 ,
                domates = 1.11 ,
                muz = 0.95 ,
                patlican = 5 ,
                tutar;
        double elmaKG, armutKG, domatesKG, muzKG, patlicanKG;
        Scanner scan = new Scanner(System.in);
        System.out.println("Armut kaç kg : ");
        elmaKG = scan.nextDouble();
        System.out.println("Elma kaç kg : ");
        armutKG = scan.nextDouble();
        System.out.println("Domates kaç kg : ");
        domatesKG = scan.nextDouble();
        System.out.println("Muz kaç kg : ");
        muzKG = scan.nextDouble();
        System.out.println("Patlıcan kaç kg : ");
        patlicanKG = scan.nextDouble();

        tutar = (elma*elmaKG)+(armut*armutKG)+(domates*domatesKG)+(muz*muzKG)+(patlican*patlicanKG);

        System.out.printf("Toplam tutar : %.2f%n", tutar);
        // %.2f  --> format belirteci kullanılarak
        // değişkeninin değeri iki basamaklı kesirli bir sayı olarak ekrana yazdırılır.

        // %n    --> ise bir satır sonu karakteri ekler.
    }
}
