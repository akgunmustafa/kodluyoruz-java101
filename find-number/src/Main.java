import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int sayac,sayi;
        int min=0;
        int max=0;

        System.out.print("Kaç tane sayıyı kontrol etmek istersiniz? : ");
        sayac= scanner.nextInt();

        for (int i=1;i<=sayac;i++){
            System.out.print(i+". Sayınızı Giriniz : ");
            sayi= scanner.nextInt();
            while (i==1){
                max=sayi;
                min=sayi;
                break;
            }
            if (sayi>max){
                max=sayi;}
            else if (sayi<min){
                min=sayi;}

        }
        System.out.print("En küçük sayınız : "+min);
        System.out.print(" ");
        System.out.print("En büyük sayınız : "+max);
    }
}