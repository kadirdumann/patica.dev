import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        // Değişkenler tanımlandı
        int faktN=1, faktR=1, fakt=1, n, r;
        double C;
        Scanner scan = new Scanner(System.in);

        System.out.print("N sayısını giriniz: ");
        n = scan.nextInt();
        // N nin faktöriyelini hesapladık
        for(int i=n;i>0;i--){
            faktN*=i;
        }

        System.out.print("R sayısını giriniz: ");
        r = scan.nextInt();
        // r nin faktöriyelini hesapladık
        for(int j=r;j>0;j--){
            faktR*=j;
        }

        // n-r nin faktöriyelini hesapladık
        for(int k=n-r;k>0;k--){
            fakt*=k;
        }

        // kombinasyon hesaplama ---> C(n,r) = n! / (r! * (n-r)!)
        C = (double)faktN/(faktR*fakt);
        System.out.println("C= "+C);
    }
}
