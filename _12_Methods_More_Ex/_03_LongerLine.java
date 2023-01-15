package _12_Methods_More_Ex;

import java.util.Scanner;

public class _03_LongerLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // You are given the coordinates of four points in the 2D plane. The first and the second pair of
        // points form two different lines. Print the longer line in format "(X1, Y1)(X2, Y2)" starting with
        // the point that is closer to the center of the coordinate system (0, 0) (You can reuse the method that
        // you wrote for the previous problem). If the lines are of equal length, print only the first one.

        double x1 = Double.parseDouble(scanner.nextLine()); 
        double y1 = Double.parseDouble(scanner.nextLine()); 
        double x2 = Double.parseDouble(scanner.nextLine()); 
        double y2 = Double.parseDouble(scanner.nextLine()); 
        double x3 = Double.parseDouble(scanner.nextLine()); 
        double y3 = Double.parseDouble(scanner.nextLine()); 
        double x4 = Double.parseDouble(scanner.nextLine()); 
        double y4 = Double.parseDouble(scanner.nextLine());

        //double lengthLine1 = CalculateLineLength(x1, y1, x2, y2);
        //double lengthLine2 = CalculateLineLength(x3, y3, x4, y4);

        double lengthLine1 = CalculateLineLength(x1, y1, x2, y2);
        double lengthLine2 = CalculateLineLength(x3, y3, x4, y4);
        if (lengthLine1 >= lengthLine2)
        {
            boolean isClosest = CheckClosestToZero(x1, y1, x2, y2);

            if (isClosest)
            {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x1, y1, x2, y2);
            }

            else
            {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x2, y2, x1, y1);

            }

        }

        else
        {
            boolean isClosest = CheckClosestToZero(x3, y3, x4, y4);
            if (isClosest)
            {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x3, y3, x4, y4);
            }

            else
            {
                System.out.printf("(%.0f, %.0f)(%.0f, %.0f)", x4, y4, x3, y3);
            }

        }

    }



    private static double CalculateLineLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }


    static boolean CheckClosestToZero(double x1, double y1, double x2, double y2)
    {
        double distance1 = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
        double distance2 = Math.sqrt(Math.pow(x2, 2) + Math.pow(y2, 2));

        if (distance1 <= distance2)
        {
            return true;
        }

        return false;
    }

}
