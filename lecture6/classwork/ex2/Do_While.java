package lecture6.classwork.ex2;

public class Do_While {
    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);
        }
        while (counter < 3);
    }
}