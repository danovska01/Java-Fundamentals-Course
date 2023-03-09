package _24_Text_Processing_More_Ex;

import java.util.Scanner;

public class _02_AsciiSumator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol1= scanner.nextLine();
        int character1= symbol1.charAt(0);
        String symbol2= scanner.nextLine();
        int  character2= symbol2.charAt(0);
        String text = scanner.nextLine();
        int sum = 0;




         for (int i =0; i <text.length() ; i++) {

             if(text.charAt(i)<character2 && text.charAt(i)>character1){

             int thisChar = text.charAt(i);


                 sum+=thisChar;
             }
     }
        System.out.println(sum);



    }
}
