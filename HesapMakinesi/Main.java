import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, select;

        Scanner scan = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz : ");
        n1 = scan.nextInt();
        System.out.println("İkinci sayıyı giriniz : ");
        n2 = scan.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = scan.nextInt();

        switch (select){
            case 1:
                System.out.println("\nSonuç : " + (n1 + n2));
                break;
            case 2:
                System.out.println("\nSonuç : " + (n1 - n2));
                break;
            case 3:
                System.out.println("\nSonuç : " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("\nSonuç : " + (n1 / n2));
                }else{
                    System.out.println("\nBir sayı 0'a bölünemez. ");
                }
                break;
            default:
                System.out.println("Hatalı seçim.");
        }
    }
}
