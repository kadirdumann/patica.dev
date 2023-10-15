import java.util.Scanner;

public class DortVeBesKuvveti {
    public static void main(String[] args) {
        int num;
        Scanner scan = new Scanner(System.in);

        // 0' dan büyük tam sayı girilmesi.
        do{
            System.out.print("Bir sayı giriniz. ");
            num = scan.nextInt();
            System.out.println("Girilen sayı : "+num);
        }while(num<0);


        // 4' ün katlarını yazdıran kısım.
        System.out.println("\n4' ün katları. ");
        for(int i=1;i<=num;i*=4){
            System.out.println(i);
        }

        // 5' in katlarını yazdıran kısım.
        System.out.println("\n5' in katları. ");
        for(int i=1;i<=num;i*=5){
            System.out.println(i);
        }
    }
}
