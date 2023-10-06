import java.util.Scanner;

public class AverageDivisibleNumbers {
    public static void main(String[] args) {
        int num, counter = 0, i = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Tam sayı giriniz : ");
        num = scan.nextInt();

        for (int tmp = 0;tmp<=num;tmp++){
            if((tmp % 3 == 0) && (tmp % 4 == 0)){
                counter += tmp ;
                i++ ;
            }
        }
        counter /= i;
        System.out.println("Ortalama : " + counter);
    }
}
