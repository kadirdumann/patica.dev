import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String userName, password, select,newPassword;
        ;

        Scanner input = new Scanner(System.in);
// şifre ve kullanıcı adını alıyoruz

        System.out.print("Kullanıcı Adını Giriniz: ");
        userName = input.nextLine();
        System.out.print("Kullacı Şifrenizi Giriniz: ");
        password = input.nextLine();

// tüm bilgiler dogruysa hatasız giriş.

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Giriş Başarılı !!");

// tüm bigilerin yanlış oldugu kombinasyon

        } else if(!(userName.equals("patika")) && !(password.equals("java123"))){
            System.out.print("Hatalı Giriş .Kullanıcı adı ve şifre yanlıştır!! Lütfen bilgileri kontrol edip tekrar deneyiniz.");

//sadece kullanıcı adının yanlış oldugu kombinasıyon

        } else if (!(userName.equals("patika")) && (password.equals("java123"))) {
            System.out.print("Kullanıcı adı hatalı lütfen Kullanıcı adını kontrol edip tekrar deneyiniz.");

// sadece parolanın yanlış oldugu kombinasyon ve kullanıcıdan şifreyi değiştirmek isteyim istemedigini ögreniyoruz ve seçim yaptırıyoruz.

        } else if(userName.equals("patika") && !(password.equals("java123"))) {
            System.out.println("Hatalı Şifre!!!");
            System.out.println("Şifrenizi unuttuysanız adımları takip edin\n Yeni şifre oluşturmak için : 'E' .\n Yeni Şifre oluşturmaktan vazgeçmek ve giriş ekranından ayrılmak için:'H'.");
            System.out.print(" Seçiminiz: ");
            select = input.nextLine();

// yaptıgı seçime göre yönlendiriyoruz.

            if (select.equals("E") || select.equals("e") ){
                System.out.print("Yeni şifre giriniz .(Lütfen daha önceki şifrelerinizden farklı bir şifre oluşturunuz:");
                newPassword = input.nextLine();
                // şifre başarılı şekilde değiştirilirse

                if (!newPassword.equals("java123")){
                    System.out.print("Yeni şifreniz başarı ile oluşturuldu.");
                    // şifre hatalı şekilde değiştirilmeye çalışılırsa
                }else {
                    System.out.print("Hatalı deneme!! Yeni şifre eskisiyle aynı olamaz. Tekrar Deneyiniz");
                }
                // kullanınıcı şifre degiştirmek istemzse
            } else if (select.equals("H") || select.equals("h")) {
                System.out.print("kullanıcı giriş sayfanda ayrılıyorsunuz ... iyi günler .");
                // kullanıcı E ve H dışında hatalı tercih yaparsa
            }else {
                System.out.print("Hatalı giriş yaptınız!! Lütfen sadece 'E ve H' seçeneklerinden birini giriniz.");
            }
        }

    }
}
