import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
        // Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

        // Formül
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //𝑢 = (a+b+c) / 2
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double kenar1, kenar2, hipo, alan, u;
        Scanner scan = new Scanner(System.in);

        System.out.println("1. kenar uzunluğu :");
        kenar1 = scan.nextDouble();
        System.out.println("2. kenar uzunluğu :");
        kenar2 = scan.nextDouble();
        hipo = Math.sqrt((kenar1*kenar1) + (kenar2*kenar2));

        u = (kenar1 + kenar2 + hipo)/2;
        alan = Math.sqrt(u*(u - kenar1)*(u - kenar2)*(u - hipo));

        System.out.println("Hipotenüs ; "+hipo+"\nAlan      ; "+alan);

    }
}
