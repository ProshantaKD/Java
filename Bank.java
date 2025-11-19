import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Balance :");
        double x = sc.nextDouble();
        for (int i = 1; i <= 6; i++) {
            System.out.println("New Balance :" + x);
            x = x + (x * 0.05);
        }
        System.out.println("Final Balance :" + x);
    }

}
