package lecture6.practic.summin;

public class SumMin {
    public static double summin(double a, double b, double number){
        for (double i = a + 1;  i < b; i++){
            number += i;
        }
        return number;
    }
}
