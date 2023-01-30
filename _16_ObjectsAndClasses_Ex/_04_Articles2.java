package _16_ObjectsAndClasses_Ex;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class _04_Articles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input:
        //3
        //title1, C, author1
        //title2, B, author2
        //title3, A, author3
        //content

        int commandsCount = Integer.parseInt(scanner.nextLine());
        List<Article> listOfArticles = new ArrayList<>();



        for (int count = 1; count <= commandsCount; count++) {
            String input = scanner.nextLine();
            Article article = new Article(input.split(", ")[0], input.split(", ")[1], input.split(", ")[2]);
            listOfArticles.add(article);
        }

        String inputToCheck = scanner.nextLine();

        switch (inputToCheck){
            case "title":
                listOfArticles.sort(Comparator.comparing(Article::getTitle));
                break;
            case "content":
                listOfArticles.sort(Comparator.comparing(Article::getContent));
                break;
            case "author":
                listOfArticles.sort(Comparator.comparing(Article::getAuthor));
                break;
            default:
                break;
        }
        for(Article a : listOfArticles){
            System.out.println(a);
        }


    }
    static class Article{
        private String title;
        private String content;

        private String author;

        public String getContent() {
            return content;
        }
        public String getAuthor() {
            return author;
        }

        public String getTitle() {
            return title;
        }

        Article (String title, String content, String author ){
            this.title= title;
            this.content= content;
            this.author= author;
        }

        @Override
        public String toString() {
            String toStringReturn = String.format("%s - %s: %s", this.title, this.content, this.author);
            return toStringReturn;
        }
    }

}
