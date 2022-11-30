import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double year;
        System.out.print("Lütfen yıl giriniz... :");
        year=input.nextDouble();

        if (year<=0){
            System.out.println("Geçerli Bir Değer Girmediniz.");
        }

        if (year % 100 == 0) {
            if (year % 400 == 0) {
                System.out.println(year + " : Yılı bir artık yıldır.");
            }else {
                System.out.println(year+" : Yılınız artık bir yıl değildir.");
            }
        }

        if (year % 4 == 0) {
            System.out.println(year + " : Yılı bir artık yıldır.");
        }else {
            System.out.println(year+" : Yılınız artık bir yıl değil.");
        }

    }
}