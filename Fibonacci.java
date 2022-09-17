import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 1;
        int n3 ;
        Scanner num = new Scanner(System.in);
        System.out.print("Fibonnacci serisi için büyüklük giriniz : ");
        int n = num.nextInt();
        System.out.print("1,1");
        for (int i=1;i<=n-2;i++){
            n3 = n1 + n2 ;
            n1 = n2;
            n2 = n3;
            System.out.print(","+n3);
        }
    }
}
