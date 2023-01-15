package _13_Lists_Lab;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        List <Double>numberList= new ArrayList<>();
        String []userInput = scanner.nextLine().split(" ");

        for (String stringNumber : userInput){
            numberList.add(Double.parseDouble(stringNumber));
        }
        for (int i = 0; i < numberList.size()-1; i++) {
            if (numberList.get(i).equals(numberList.get(i+1))){
                double sum = numberList.get(i)+numberList.get(i+1);
                numberList.set(i, sum);
                numberList.remove(i+1);
                i = -1;
            }


        }
        /*for(int index=0; index<numberList.size(); index++){
            NumberFormat formatter = new DecimalFormat("0.#");
            System.out.print(formatter.format(numberList.get(index)));
            System.out.print(" ");
        }*/
    DecimalFormat decimalFormat = new DecimalFormat("0.#");
        for(Double number:numberList){
            System.out.println(decimalFormat.format(number)+ " ");
        }


    }
}
