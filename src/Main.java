import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Değişkenler
        int n;
        int toplam = 0;
        // Kullanıcı girişi
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Lütfen Bir Sayı Giriniz : ");
        n = scanner.nextInt();
        // Kontrol Kısmı
        if (n <= 0) {
            System.out.println("Negatif Veya Sıfır Bir Sayı Mükemmel Sayı Olamaz.");
        } else {
        //Kontrol Kısmı
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    toplam += i;
                }
            }
        //Sonuç
            if (toplam == n) {
                System.out.println(n + " Mükemmel Sayıdır.");

            } else {
                System.out.println(n + " Mükemmel Sayı Değildir.");
            }
        }
    }
}
