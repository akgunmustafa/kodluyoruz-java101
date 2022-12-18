import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı yazınız ...:");
        int sayi= scanner.nextInt();
        int toplam=0;

        while (sayi!=0){
            toplam+=sayi%10;
            sayi=sayi/10;

        }
        System.out.print("Yazdığınız sayının basamakları toplamı = "+toplam);
    }
}