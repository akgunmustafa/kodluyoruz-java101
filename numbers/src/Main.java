import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int number1=0;
        double result;
        int sayac = 0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        number = inp.nextInt();
        for (int i=0; i<=number;i++){
            if ((i % 12) == 0){
                number1=number1+i;
                sayac=sayac+1;
            }
        }
        result=number1/sayac;
        System.out.println("0'dan "+number+" 'ya kadar olan sayıların 3 ve 4 e kalansız bölünenlerin ortalaması : "+result);
    }
}