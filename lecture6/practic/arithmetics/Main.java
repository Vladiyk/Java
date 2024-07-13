package lecture6.practic.arithmetics;

import java.util.Scanner;

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

        int a;
        int b;
        boolean end = false;

        while (!end){
            System.out.print("Enter number one: ");
            a = sc.nextInt();

            System.out.print("Enter number two: ");
            b = sc.nextInt();

            System.out.print("What are you want to do (1 - Addition, " +
                    "2 - Distribution, 3 - Subtraction, 4 - Multiplication ): ");
            answer = sc.nextInt();

            switch (answer){
                case 1:
                    System.out.println(a + " + " + b + " = " + Addition.add(a, b));
                    break;
                case 2:
                    System.out.println(a + " / " + b + " = " + Distribution.div(a, b));
                    break;
                case 3:
                    System.out.println(a + " - " + b + " = " + Subtraction.sub(a, b));
                    break;
                case 4:
                    System.out.println(a + " * " + b + " = " + Multiplication.mul(a, b));
                    break;
            }

            System.out.print("Do you want to continue (1 - Yes; 2 - No): ");
            answer = sc.nextInt();

            switch (answer) {
                case 1:
                    continue;
                case 2:
                    end = true;
            }
        }
        sc.close();
    }
}
