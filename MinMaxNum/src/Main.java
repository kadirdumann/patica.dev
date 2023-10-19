import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num ,i = 1;
        int min=0,max=0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz : ");
        num = scan.nextInt();

        while(i<=num){
            System.out.print(i+". sayı : ");
            int sayi = scan.nextInt();
            if (sayi>max)
                max=sayi;
            else if (sayi<min)
                min=sayi;
            i++;
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}
