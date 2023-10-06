import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        int num, sum = 0;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Tam sayı giriniz : ");
            num = scan.nextInt();

            if(num % 2 == 0){
                if(num % 4 == 0){
                    sum += num;
                }
            }
        }while(num % 2 == 0);

        System.out.println("Toplam : "+sum);

    }
}
