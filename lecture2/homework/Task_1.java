package lecture2.homework;

public class Task_1 {
    public static void main(String[] args) {

        int x = 10;
        int y = 12;
        int z = 3;

        x += y - x++ * z;
        System.out.println("x += y - x++ * z" + "\nx = " + x);

        z = --x - y * 5;
        System.out.println("\nz = --x - y * 5" + "\nz = " + z);

        y /= x + 5% z;
        System.out.println("\ny /= x + 5% z" + "\ny = " + y);

        z = x++ + y * 5;
        System.out.println("\nz = x++ + y * 5" + "\nz = " + z);

        x = y - x++ * z;
        System.out.println("\nx = y - x++ * z" + "\nx = " + x);
    }
}
