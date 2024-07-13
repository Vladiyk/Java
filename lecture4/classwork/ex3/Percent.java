package lecture4.classwork.ex3;

import java.util.Scanner;

public class Percent {
    public static void main(String[] args) {
        System.out.print("How many products do you want: ");
        Scanner sc = new Scanner(System.in);
        double product = sc.nextDouble();
        double percent = 0.75;
        double price = 8.0;
        double sum;

        sum = product >= 10 ? ( (price * product) * percent) : (price * product);
        System.out.println("Purchase amount: " + sum + "$");
    }
}
