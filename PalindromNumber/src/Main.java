import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp = number,
                reverseNum = 0,
                lastNum;

        while(temp != 0){
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        return number == reverseNum;
    }

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz :");
        number = scan.nextInt();
        System.out.println(isPalindrom(number));
    }
}