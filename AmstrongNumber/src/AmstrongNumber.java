import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        int basValue;
        int total = 0;
        int index = 0;
        int sum = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int number = scan.nextInt();
        int realNumber = number;

        while (number != 0) {
            basValue = number % 10;
            number = number / 10; 		// basamak sayısı ve aynı zamanda basamak sayılarının toplamı
            total = total + basValue;
            index++;
        }
        number = realNumber;
        while (number != 0) {
            basValue = number % 10;
            sum = (int) (sum + Math.pow(basValue, index)); 	  // basamak sayılarının basamak sayı cinsinden üslerinin alınması
            number /= 10;

        }

        System.out.println("Basamak sayılarının toplamı : " + total);
        System.out.println("Basamak sayısı : " + index);

        if (sum == realNumber) {
            System.out.println(sum + " armstrong sayıdır.");
        } else {
            System.out.println(sum + " armstrong sayı değildir.");
        }
    }
}
