package lecture2.homework;

public class Volume {
    public static void main(String[] args) {
        final double PI = 3.14159;

        double r = 6.32;

        double h = 8.4;

        double v = PI * r * r * h;

        double s = 2 * PI * r * (r + h);

        System.out.println("Радіус целіндра: " + r + "\nВисота целіндра: " + h +
                "\nОб'єм целіндра: " + v + "\nПлоща циліндра: " + s);
    }
}
