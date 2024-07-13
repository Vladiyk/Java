package lecture6.practic;

public class Pythagorean_Table {
    public static void main(String[] args) {
        int num = 1;

        while (num < 11) {
            for (int i = 1; i < 11; i++){
                System.out.print(num * i + " ");
            }
            num++;
            System.out.println();
        }
    }
}
