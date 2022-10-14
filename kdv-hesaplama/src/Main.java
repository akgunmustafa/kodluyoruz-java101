import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhaba, KDV hesaplama aracını kullanıyorsun.");
        System.out.print("Hesaplanmasını istediğin tutarı gir...:");
        Scanner input=new Scanner(System.in);
        double money;
        money=input.nextInt();

        //%18 KDV
        if (money>0 & money<1000){
            double kdv=money/100*18;
            double kdvsonucu=money-kdv;
            System.out.println("Paranızın %18 KDV'si : "+kdv);
            System.out.println("Kalan ana paranız : "+kdvsonucu);
        }
        //%8 KDV
        else {
            double kdv=money/100*8;
            double kdvsonucu=money-kdv;
            System.out.println("Paranızın %8 KDV'si : "+kdv);
            System.out.println("Kalan ana paranız : "+kdvsonucu);
        }






    }
}