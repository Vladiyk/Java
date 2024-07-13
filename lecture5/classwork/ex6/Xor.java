package lecture5.classwork.ex6;

public class Xor {
    public static void main(String[] args) {
        short secretkey = 5;
        char character = 'A';

        System.out.println(
                "Вхідний символ: " + character + ", його код у кодовій таблиці: " +
                        (byte) character);

        character = (char) (character ^ secretkey);
        System.out.println(
                "Вхідний символ: " + character + ", його код у кодовій таблиці: " +
                        (byte) character);

        character = (char) (character ^ secretkey);
        System.out.println(
                "Вхідний символ: " + character + ", його код у кодовій таблиці: " +
                        (byte) character);
    }
}
