import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int year ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        year = scan.nextInt();

        if (!(year%400 == 0)){
            if (!(year%100 == 0)){
                if(year%4 == 0){
                    System.out.println(year + " bir artık yıldır !");
                }
                else
                    System.out.println(year + "  bir artık yıldır değildir !");
            }
            else
                System.out.println(year + "  bir artık yıldır değildir !");
        }
        else
            System.out.println(year + " bir artık yıldır !");
    }
}
