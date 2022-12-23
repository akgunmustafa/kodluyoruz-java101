import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number,toplam=0;

        System.out.print("Bir sayı giriniz : ");
        number= scanner.nextInt();

        for (int i=1; i<number;i++){
            if (number%i==0){
                toplam+=i;
            }
        }if (toplam==number){
            System.out.print(number+"  Mükemmler Sayıdır...");
        }else {
            System.out.print(number+ "  Mükemmel Sayı Değildir...");
        }
    }
}