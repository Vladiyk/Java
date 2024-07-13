package lecture5.homework;

import java.util.Scanner;

public class Parity {
    public static void main(String[] args) {
        System.out.print("Enter number: ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0){
            System.out.println("This number is pair");
        }else {
            System.out.println("This number is unpair");
        }

        if ((number & 1) == 0){
            System.out.println("This number is pair");
        }else {
            System.out.println("This number is unpair");
        }
    }
}