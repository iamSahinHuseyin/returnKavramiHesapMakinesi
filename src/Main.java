import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Toplama Methodu
    public static int Toplama(int a, int b) {
        return a + b;
    }
    //Çıkarma Methodu
    public static int Cikarma(int a, int b) {
        return a - b;
    }
    //Çarpma Methodu
    public static int Carpma(int a, int b) {
        return a * b;
    }
    //Bölme Methodu
    public static int Bolme(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        //RETURN KAVRAMI İLE 4 İŞLEM YAPAN HESAP MAKİNESİ

        //kullanıcın gireceği iki sayıyı aldık.
        Scanner sc = new Scanner(System.in);
        int a,b,sonuc;
        System.out.print("Sayı giriniz: ");
        a = sc.nextInt();
        System.out.print("Sayı giriniz: ");
        b = sc.nextInt();

        System.out.println("Hangi işlemi yapmak istersiniz?\n" +
                " 1: Toplama \n" +
                " 2: Çıkarma \n" +
                " 3: Çarpma \n" +
                " 4: Bölme \n");
        int secim = 0;
        secim = sc.nextInt();

        if (secim == 1){
            System.out.println("Buradan toplama işlemi yapılmaktadır.");
            //Toplama metodunu çağırdık.
            sonuc = Toplama(a,b);
            System.out.println("Girdiğiniz sayıların toplamı: " + sonuc);
        }
        else if (secim == 2){
            System.out.println("Buradan çıkarma işlemi yapılmaktadır.");
            //Çıkarma metodunu çağırdık.
            sonuc = Cikarma(a,b);
            System.out.println("Girdiğiniz sayıların farkı " + sonuc);
        }
        else if (secim == 3){
            System.out.println("Buradan çarpma işlemi yapılmaktadır.");
            //Çarpma metodunu çağırdık.
            sonuc = Carpma(a,b);
            System.out.println("Girdiğiniz sayıların çarpımı " + sonuc);
        }
        else if (secim == 4){
            System.out.println("Buradan bölme işlemi yapılmaktadır.");
            //Bölme metodunu çağırdık.
            sonuc = Bolme(a,b);
            System.out.println("Girdiğiniz sayıların bölünmesi sonucu " + sonuc);
        }
        else {
            System.out.println("Eksik veya hatalı bir işlem seçtiniz. Uygulama sonlandırılıyor.");
        }

    }
}