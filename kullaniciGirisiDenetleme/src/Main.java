import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName, password, changePassword, newPassword;
        Scanner inp =new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();

        System.out.print("Şifreniz :");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Sisteme girişiniz yapıldı");
        } else {
            System.out.print("Şifreniz hatalı, sıfırlamak isterseniz evet yazıp enterlayın ");
            changePassword = inp.nextLine();
            if (changePassword.equals("evet")){
                System.out.println("Yeni Şifrenizi Giriniz ");
                newPassword = inp.nextLine();
                if (newPassword.equals(password)){
                    System.out.println("Girmiş olduğunuz şifre eski şifreniz ile aynıdır. Tekrar deneyiniz.");
                    System.out.println("Yeni Şifrenizi Giriniz ");
                    newPassword = inp.nextLine();
                    if (!newPassword.equals(password)){
                        System.out.println("Şifreniz Başarıyla kaydedildi.");
                    }
                }else {
                    System.out.println("Yeni şifreniz başarı şekilde kayıt edilmiştir.");
                }
            }

        }

    }
}