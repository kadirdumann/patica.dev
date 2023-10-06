import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan
        // ve ortalamalarını hesaplayıp ekrana bastırılan program

        int mat, fizik, kimya, turkce, tarih, muzik, sonuc;
        double ort;
        Scanner scan = new Scanner(System.in);

        System.out.println("Matematik Notunuzu giriniz :");
        mat = scan.nextInt();

        System.out.println("Fizik Notunuzu giriniz :");
        fizik = scan.nextInt();

        System.out.println("Kimya Notunuzu giriniz :");
        kimya = scan.nextInt();

        System.out.println("Türkçe Notunuzu giriniz :");
        turkce = scan.nextInt();

        System.out.println("Tarih Notunuzu giriniz :");
        tarih = scan.nextInt();

        System.out.println("Müzik Notunuzu giriniz :");
        muzik = scan.nextInt();

        ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;

        sonuc = Hesaplama(ort);
        switch (sonuc){
            case 1:
                System.out.println("Ortalamanız : " + ort + "\nSınıfı geçtiniz.");
                break;
            default:
                System.out.println("Ortalamanız : " + ort + "\nSınıfta kaldınız.");

        }

    }

    public static int Hesaplama (double ort){
        while(ort <= 60){
            return 0;
        }
        return 1;
    }


}