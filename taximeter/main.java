import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int gidilecekKM ,tutar ,acilisUcret = 10;
        double tutarKM = 2.20;

        Scanner scan = new Scanner(System.in);
        System.out.println("Gidilecek mesafe (KM) : ");
        gidilecekKM = scan.nextInt();
        tutar = (int) (acilisUcret + (gidilecekKM * tutarKM));
        if (tutar <= 20)
            tutar = 20;

        System.out.println(gidilecekKM +" KM için ödenecek tutar : " + tutar + " TL");
    }
}
