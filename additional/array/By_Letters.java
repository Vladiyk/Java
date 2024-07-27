package additional.array;

import java.util.Scanner;

public class By_Letters {
    public static void main(String[] args) {

        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        String[] name_letters = name.split("");

        int i = 0;
        int lenght = name_letters.length;

        while (i < lenght){
            System.out.print(name_letters[i] + " ");
            i++;
        }
    }
}
