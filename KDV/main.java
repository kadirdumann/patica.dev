import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
        //(Not : KDV tutarını 18% olarak alın)

        double tutar, kdvTutar, kdvliFiyat, kdvOran;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ücret tutarını girin :");
        tutar = scan.nextDouble();

        kdvOran = kdvHesap(tutar);

        kdvTutar = tutar * kdvOran;
        kdvliFiyat = tutar + kdvTutar;

        System.out.println("Tutarın kdv oranı : " +kdvTutar+ "\nKDV' li Fiyatı : " +kdvliFiyat);
    }

    public static double kdvHesap(double tutar){
        if ((tutar <= 1000) && (tutar >= 0)){
            return 0.18;
        }
        else
            return 0.8;
    }
}
