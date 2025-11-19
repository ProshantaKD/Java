import java.util.Scanner;

public class TemperaturE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temp = new double[5];
        double total = 0;
        for (int i = 0; i < 5; i++) {
            temp[i] = sc.nextDouble();
            total += temp[i];
        }
        System.out.println("Total temperure :" + total);
        double avg = total / 5;
        System.out.println("Average temperature :" + avg);
    }

}
