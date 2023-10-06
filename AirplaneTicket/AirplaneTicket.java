import java.util.Scanner;

public class AirplaneTicket {
    public static void main(String[] args) {
        double perKM, price = 0, kmPrice = 0.10;
        int age, type;

        Scanner scan = new Scanner(System.in);

// Kullanıcı bilgilerinin alınması ve kontrol edilmesi.

        System.out.println("Yaşınız : ");
        age = scan.nextInt();
        if (age <= 0)
            System.out.println("Hatalı Veri Girdiniz !");

        System.out.println("Gidilecek mesafe(KM) : ");
        perKM = scan.nextDouble();
        if (perKM <= 0)
            System.out.println("Hatalı Veri Girdiniz !");

        System.out.println("1. Tek Yön \n2. Gidiş-Dönüş \nYolculuk tipi ? ");
        type = scan.nextInt();
        if(!(type == 1 ) && !(type == 2))
            System.out.println("Hatalı Veri Girdiniz !");

// Ücretlendirme
        price += (perKM * kmPrice);

        if (type == 1)
            price *= 1;
        else if (type == 2) {
            System.out.println("Gidiş-Dönüş ile %20 indirim kazandınız.");
            price -= (price * 0.2);
        }else
            System.out.println("Hatalı Veri Girdiniz !");

// Yaşlara göre indirimli ücretlendirme

        if (age <= 12){
            System.out.println("%50 indirim kazandınız. \nÜcret : " +
                    (price -= (price * 0.5)));
        } else if ((age > 13) && (age < 24)){
            System.out.println("%10 indirim kazandınız. \nÜcret : " +
                    (price -= (price * 0.1)));
        }else if (age >= 65){
            System.out.println("%30 indirim kazandınız. \nÜcret : " +
                    (price -= (price * 0.3)));
        }else
            System.out.println("Ücret : " + price);

        scan.close();
    }
}
