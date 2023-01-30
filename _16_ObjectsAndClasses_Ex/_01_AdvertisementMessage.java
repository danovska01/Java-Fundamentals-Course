package _16_ObjectsAndClasses_Ex;

import java.util.Random;
import java.util.Scanner;

public class _01_AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String phrasesSeveral = "\"Excellent product.\", \"Such a great product.\", \"I always use that product.\", \"Best product of its category.\", \"Exceptional product.\", \"I can’t live without this product.\"";
        String eventsSeveral= "\"Now I feel good.\", \"I have succeeded with this product.\", \"Makes miracles. I am happy of the results!\", \"I cannot believe but now I feel awesome.\", \"Try it yourself, I am very satisfied.\", \"I feel great!\"";
        String authorsSeveral= "\"Diana\", \"Petya\", \"Stella\", \"Elena\", \"Katya\", \"Iva\", \"Annie\", \"Eva";
        String citySeveral= "\"Burgas\", \"Sofia\", \"Plovdiv\", \"Varna\", \"Ruse";

        String[] phrase = phrasesSeveral.split("\", \"");
        String[] events = eventsSeveral.split("\", \"");
        String[] author = authorsSeveral.split("\", \"");
        String[] city = citySeveral.split("\", \"");;

        for (int i = 0; i < n; i++) {
            Random rnd = new Random();
                int pos = rnd.nextInt(phrase.length);
                int pos2= rnd.nextInt(events.length);
                int pos3= rnd.nextInt(author.length);
                int pos4= rnd.nextInt(city.length);
            System.out.print(phrase[pos].trim().replaceAll("\"", " ") + " "
                    + events[pos2].trim().replaceAll("\"", " ") + " "
                    + author[pos3].trim().replaceAll("\"", " ").replaceAll("\\|", " ")
                    + " - " + city[pos4].trim().replaceAll("\"", " ").replaceAll("\\|", " "));
            System.out.println();

            }





        }
    }









