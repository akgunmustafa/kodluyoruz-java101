import java.util.Scanner;

public class Main {

    static boolean isPolindrome(int number) {
        int temp = number;
        int reversnumber = 0;
        int lastnumber;
        while (temp!=0){
        lastnumber = temp % 10;
        reversnumber = reversnumber * 10 + lastnumber;
        temp /= 10;
        }

        return number == reversnumber;


    }

    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("Give me a number please .. >");
        int b=a.nextInt();
        System.out.print(isPolindrome(b));

    }
}