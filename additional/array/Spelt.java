package additional.array;

public class Spelt {
    public static void spelt(String name, int length, int i){
        String[] spelt = name.split("");
        length = spelt.length;

        while (i < length){
            System.out.print(spelt[i] + " ");
            i++;
        }
    }
}
