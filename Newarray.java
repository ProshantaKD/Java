import java.util.Scanner;

public class Newarray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        // takes value from users;
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        // prints the value which are takes from users;
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }

    }

}
