import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;
        Scanner input=new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Sayı Olarak Giriniz...: ");
        month=input.nextInt();

        System.out.print("Doğduğunuz Günü Sayı Olarak Giriniz...: ");
        day=input.nextInt();

        if (month<=1){
            if (day<=21){
                System.out.println("Oğlak Burcusunuz.");
            }else {
                System.out.println("Kova Burcusunuz");
            }
        }
        if (month==2){
            if (day<=19){
                System.out.println("Kova Burcusunuz.");
            }else {
                System.out.println("Balık Burcusunuz");
            }
        }
        if (month==3){
            if (day<=20){
                System.out.println("Balık Burcusunuz.");
            }else {
                System.out.println("Koç Burcusunuz");
            }
        }
        if (month==4){
            if (day<=20){
                System.out.println("Koç Burcusunuz.");
            }else {
                System.out.println("Boğa Burcusunuz");
            }
        }
        if (month==5){
            if (day<=21){
                System.out.println("Boğa Burcusunuz.");
            }else {
                System.out.println("İkizler Burcusunuz");
            }
        }
        if (month==6){
            if (day<=22){
                System.out.println("İkizler Burcusunuz.");
            }else {
                System.out.println("Yengeç Burcusunuz");
            }
        }
        if (month==7){
            if (day<=22){
                System.out.println("Yengeç Burcusunuz.");
            }else {
                System.out.println("Aslan Burcusunuz");
            }
        }
        if (month==8){
            if (day<=22){
                System.out.println("Aslan Burcusunuz.");
            }else {
                System.out.println("Başak Burcusunuz");
            }
        }
        if (month==9){
            if (day<=22){
                System.out.println("Başak Burcusunuz.");
            }else {
                System.out.println("Terazi Burcusunuz");
            }
        }
        if (month==10){
            if (day<=21){
                System.out.println("Terazi Burcusunuz.");
            }else {
                System.out.println("Akrep Burcusunuz");
            }
        }
        if (month==11){
            if (day<=21){
                System.out.println("Akrep Burcusunuz.");
            }else {
                System.out.println("Yay Burcusunuz");
            }
        }
        if (month==12){
            if (day<=19){
                System.out.println("Yay Burcusunuz.");
            }else {
                System.out.println("Oğlak Burcusunuz");
            }
        }

    }
}