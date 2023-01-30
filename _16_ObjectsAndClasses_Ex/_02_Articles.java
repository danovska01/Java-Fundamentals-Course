package _16_ObjectsAndClasses_Ex;

import java.util.List;
import java.util.Scanner;
public class _02_Articles {


    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        // Input:
        // some title, some content, some author
        //3
        //Edit: better content
        //ChangeAuthor:  better author
        //Rename: better title

        String input= scanner.nextLine();
        int commandsCount = Integer.parseInt(scanner.nextLine());

        Article article = new Article(input.split(", ")[0], input.split(", ")[1], input.split(", ")[2]);

        for (int count = 1; count <= commandsCount; count++) {
           String command = scanner.nextLine();
           String commandName = command.split(": ")[0];
           String newValue = command.split(": ")[1];

            switch (commandName){
                case "Edit":
                    // zadavam nov content na statiq
                    article.setContent(newValue);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(newValue);
                    break;
                case "Rename":
                    article.setRename(newValue);
                    break;

            }

        }


        System.out.println(article.toString());
    }
    static class Article{
        private String title;
        private String content;
        private String author;


        Article (String title, String content, String author ){
           this.title= title;
           this.content= content;
           this.author= author;
       }
       public void setContent (String newContent){
           this.content= newContent;
       }
        public void setAuthor (String newAuthor){
           this.author= newAuthor;

        }
        public void setRename(String newTitle) {
           this.title= newTitle;

        }
        @Override
        public String toString() {
            String toStringReturn = String.format("%s - %s: %s", this.title, this.content, this.author);
            return toStringReturn;
        }
    }

}
