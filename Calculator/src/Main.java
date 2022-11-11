import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi1, sayi2, islem, toplama, cikarma, carpma, bolme;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("İşlemi seçiniz: \n 1-Toplama \n 2- Çıkarma \n 3- Carpma\n 4- Bölme");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplama sonucu: " + (sayi1 + sayi2));
                break;
            case 2:
                System.out.println("Cikarma sonucu: " + (sayi1 - sayi2));
                break;
            case 3:
                System.out.println("Carpma sonucu: " + (sayi1 * sayi2));
                break;
            case 4:
                System.out.println("Bolme Sonucu: " + (sayi1 / sayi2));
            default:
                System.out.println("Yanlış değer girdiğiniz lütfen tekrar deneyiniz.");
        }


    }
}