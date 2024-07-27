package additional.array;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ByLetters byLetters = new ByLetters();

        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String[] spilt = byLetters.spelt(name);

        for (int i = 0; i < spilt.length; i++){
            System.out.print(spilt[i] + " ");
        }
        System.out.println("\n" + "Letters in the name: " + spilt.length);
    }
}
