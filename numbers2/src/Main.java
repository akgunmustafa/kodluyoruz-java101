import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int total=0;
        Scanner scan=new Scanner(System.in);
        do {
            System.out.print("Sayı Giriniz :");
            number=scan.nextInt();
            if (number%4==0){
                total+=number;
            }
        }while (number%2==0);
        System.out.println("Girdiğiniz sayılardan 4 ün katı olanların toplamı : "+total);
    }
}