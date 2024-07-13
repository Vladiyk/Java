package lecture6.practic;

public class Rectangle {
    public static void main(String[] args) {
        int width = 10;
        int height = 5;

        for (int h = 0; h < height; h++){
            for (int w = 0; w < width; w++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
