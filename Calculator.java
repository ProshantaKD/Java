import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Summation is:" + sum);
        int sub = a - b;
        System.out.println("Subtraction is:" + sub);
        int mul = a * b;
        System.out.println("Multiplication is:" + mul);
        int div = a / b;
        System.out.println("Division is:" + div);
        int mod = a % b;

        System.out.println("Modulus is:" + mod);
    }

}
