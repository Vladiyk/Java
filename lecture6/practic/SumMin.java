package lecture6.practic;

import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        String pair;
        int unpair = 0;

        System.out.print("Enter number a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("Enter number b: ");
        int b = sc.nextInt();

        if (a < b){
            for (int i = a + 1;  i < b; i++){
                System.out.print(i + " ");
                if ((i % 2) == 0){
                }else {
                    unpair = i;
                }
                System.out.println(unpair);
            }
        }
        if (a > b){
            for (int i = a - 1;  i > b; i--){
                System.out.print(i + " ");
            }
        }

    }
}
