package lecture6.practic.summin;

import java.util.List;

public class Unpair {
    public static List<Integer> unpair(double a, double b, double i, List<Integer> un){
        for (i = a + 1; i < b; i++) {
            if (i % 2 != 0) {
                un.add((int) i);
            }
        }
        return un;
    }
}