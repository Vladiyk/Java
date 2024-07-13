package lecture6.practic;

public class Pyramid {
    public static void main(String[] args) {
        int stars = 1;
        int height = 5;

        for (int h = 0; h < height; h++){
            for (int s = 0; s < stars; s++){
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }
    }
}
