package _12_Methods_More_Ex;

import java.util.Scanner;

public class _01_DataType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        // Write a program that, depending on the first line of the input, reads an int, double or string.
        //    • If the data type is int, multiply the number by 2.
        //    • If the data type is real, multiply the number by 1.5 and format it to the second decimal point.
        //    • If the data type is string, surround the input with "$".

        String type = scanner.nextLine();
        switch (type){
            case "int":
                int number = Integer.parseInt(scanner.nextLine());
                int result = dataReader(number);
                System.out.println(result);
                break;
            case "real":
                double number1 = Double.parseDouble(scanner.nextLine());
                double result1= dataReader(number1);
                System.out.printf("%.2f", result1);
                break;
            case "string":
                String text = scanner.nextLine();
                String textResult = dataReader(text);
                System.out.println(textResult);
                break;
            
        }




    }

    private static int dataReader(int input) {
        int result = input*2;
        return result;
    }
    private static double dataReader(double input) {
        double result = input*1.5;
        return result;
    }
    private static String dataReader(String input) {
        String result = "$"+input+"$";
        return result;
    }


}
