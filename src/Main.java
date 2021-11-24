import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bakiyenizi giriniz:");

        double bakiye = scanner.nextDouble();

        String islemler = "1. İşlem: Bakiye Öğrenme\n" + "2. İşlem: Para Çekme\n" + "3. İşlem: Para Yatırma\n" + "Çıkmak için E'ye basınız.\n";

        System.out.println("**********************************");

        System.out.println(islemler);

        System.out.println("**********************************");

        while (true) {

            System.out.println("Yapmak istediğiniz işlemi seçiniz:");
            String islem = scanner.nextLine();

            if (islemler.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            } else if (islem.equals("2")) {

                System.out.println("Çekmek istediğiniz tutarı giriniz.");

                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye - tutar < 0) {
                    System.out.println("İstediğiniz tutar bakiyenizi aşıyor.");
                } else if (bakiye - tutar > 0) {

                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }

            } else if (islem.equals("3")) {

                System.out.println("Yatırmak istediğiniz tutarı giriniz.");

                int yatirilanPara = scanner.nextInt();
                scanner.nextLine();

                bakiye += yatirilanPara;

                System.out.println("Yeni bakiyeniz: " + bakiye);


            } else if (islem.equals("E") || islem.equals("e")) {
                System.out.println("Sistemden Çıkılıyor:");
                break;

            } else {
                System.out.println("Geçersiz bir işlem girişi yaptınız.");
            }
        }
    }
}
