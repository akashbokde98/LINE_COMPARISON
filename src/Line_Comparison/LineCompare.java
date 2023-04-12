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
        //Taking Inputs For Line 2.
        System.out.println("Enter X3 Point Value of X-Coordinate:");
        int x3 = in.nextInt();
        System.out.println("Enter Y3 Point Value of Y-Coordinate:");
        int y3 = in.nextInt();
        System.out.println("Enter X4 Point Value of X-Coordinate:");
        int x4 = in.nextInt();
        System.out.println("Enter Y4 Point Value of Y-Coordinate:");
        int y4 = in.nextInt();

        //Calculating Length of Lines.
        double lengthOfLine_1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("Length of a Line1 is:" + lengthOfLine_1);

        double lengthOfLine_2 = Math.sqrt((x4 - x3)^2 + (y4 - y3)^2);
        System.out.println("Length of a Line2 is:" + lengthOfLine_2);

        //Checking Equality of Two Lines.
        if (lengthOfLine_1 == lengthOfLine_2)
        {
            System.out.println("Length of Line1 and Line2 are Equal");
        }
        //Comparing Lines Greater or Less.
        else if (lengthOfLine_1 > lengthOfLine_2)
        {
            System.out.println("Length of Line1 is Greater than Line2.");
        }
        else
        {
            System.out.println("Length of Line2 is Greater than line1.");
        }
    }
}
