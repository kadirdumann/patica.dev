import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("N sayısı : ");
        int num = scan.nextInt();
        System.out.print("Çıktı : ");
        Recursive(num);
    }


    static void Recursive(int num) {
        System.out.print(num + " ");
        if (num > 0) {
            Recursive(num - 5);
        }
        System.out.print(num + " ");
    }
}