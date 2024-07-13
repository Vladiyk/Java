package lecture6.practic.summin;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.print("Do you want to run the program (1 - Yes; 2 - No): ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        switch (answer){
            case 1:
                break;
            case 2:
                return;
        }

        boolean end = false;
        double number = 0;
        List<Integer> unpair = new ArrayList<>();
        double a;
        double b;

        System.out.print("Do you want to find out the sum or" +
                " display all unpaired numbers(1 - sum; 2 - unpair): ");
        answer = sc.nextInt();

        switch (answer){
            case 1:
                while (!end) {
                    System.out.print("Enter number a: ");
                    a = sc.nextDouble();

                    System.out.print("Enter number b: ");
                    b = sc.nextDouble();

                    System.out.println(SumMin.summin(a, b, number));
                    System.out.print("Do you want to continue (1 - Yes; 2 - No): ");
                    answer = sc.nextInt();

                    switch (answer) {
                        case 1:
                            continue;
                        case 2:
                            end = true;
                    }
                }
            case 2:
                while (!end) {
                    System.out.print("Enter number a: ");
                    a = sc.nextDouble();

                    System.out.print("Enter number b: ");
                    b = sc.nextDouble();

                    System.out.println(Unpair.unpair(a, b, number, unpair));
                    System.out.print("Do you want to continue (1 - Yes; 2 - No): ");
                    answer = sc.nextInt();

                    switch (answer) {
                        case 1:
                            continue;
                        case 2:
                            end = true;
                    }
                }
        }
    }
}
