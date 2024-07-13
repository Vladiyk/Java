package additional;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter number one: ");

        Scanner sc = new Scanner(System.in);
        double numberOne = sc.nextDouble();

        System.out.print("Enter number two: ");
        double numberTwo = sc.nextDouble();

        System.out.print("Enter number three: ");
        double numberThree = sc.nextDouble();

        System.out.println(
                "Arithmetic average = " +
                Arithmetic.arithmeticAverage(numberOne, numberTwo, numberThree)
        );

    }
}
