package additional.array;

import java.util.Scanner;

public class By_Letters {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        int i = 0;
        int length = 0;

        Spelt.spelt(name, length, i);
    }
}
