package lecture4.practic;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {

        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        String word;
        String answer;
        final String continuum = "Перекласти ще одне слово? (Так/Ні) ";

        while (!exit){
            System.out.print("Введить слово: ");
            word = sc.next().toLowerCase();

            switch (word) {
                case "сонячно":
                    System.out.print(word + " перекладаеться як Sunny\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "дощ":
                    System.out.print(word + " перекладаеться як Rain\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "сніг":
                    System.out.print(word + " перекладаеться як Snow\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "хмарно":
                    System.out.print(word + " перекладаеться як Cloudy\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "вітряно":
                    System.out.print(word + " перекладаеться як Windy\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "гроза":
                    System.out.print(word + " перекладаеться як Thunderstorm\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "торнадо":
                    System.out.print(word + " перекладаеться як Tornado\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "ураган":
                    System.out.print(word + " перекладаеться як Hurricane\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "туман":
                    System.out.print(word + " перекладаеться як Fog\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                case "злива":
                    System.out.print(word + " перекладаеться як Downpour\n" + continuum);
                    answer = sc.next().toLowerCase();
                    break;
                default:
                    System.out.print("Такого слова немає в нашому словнику\n" + continuum);
                    answer = sc.next().toLowerCase();
            }
            switch (answer){
                case "так":
                    continue;
                case "ні":
                    exit = true;
                    break;
            }
        }
    }
}