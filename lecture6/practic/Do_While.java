package lecture6.practic;

public class Do_While {
    public static void main(String[] args) {
        int counter = 0;
        int sum = 0;

        do {
            sum++;
            counter++;
            System.out.println(sum + " Vlada");
        }
        while (counter < 10);
    }
}
