package Line_Comparison;
import java.util.Scanner;
import java.lang.Math;

public class LineCompare
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome To Line Comparison Computation Problem!");
        //Taking User Input For X and Y Coordinates.
        System.out.println("Enter X1 Point Value of X-Coordinate:");
        int x1 = in.nextInt();
        System.out.println("Enter Y1 Point Value of Y-Coordinate:");
        int y1 = in.nextInt();
        System.out.println("Enter X2 Point Value of X-Coordinate:");
        int x2 = in.nextInt();
        System.out.println("Enter Y2 Point Value of Y-Coordinate:");
        int y2 = in.nextInt();

        //Calculating Length of a Line.
        double lengthOfLine = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("Length of a Line is:" + lengthOfLine);
    }
}
