package lecture3.classwork;

public class CW {
    public static void main(String[] args) {
        byte a = 0;
        System.out.println(++a + "\n" + a);

        byte b = 1;
        System.out.println("\n" + b++ + "\n" + b);

        byte c = 2;
        System.out.println("\n" + --c + "\n" + c);

        byte d = 3;
        System.out.println("\n" + d-- + "\n" + d);

        byte e = 2;
        e += 6;
        e = (byte) (e + 6);

        boolean myBoolean1;
        boolean myBoolean2;

        String myString1 = "text";
        String myString2 = "text";

        myBoolean1 = myString1 == myString2;
        myBoolean2 = myString2.equalsIgnoreCase(myString1);

        System.out.println("\n" + myBoolean1 + "\n" + myBoolean2);
    }
}
