package Line_Comparison;
import javax.sound.sampled.Line;
import java.util.Scanner;
import java.lang.Math;

public class LineCompare
{
    Scanner in = new Scanner(System.in);
    //Calculating Length of Line1.
    public double lengthOfLine1()
    {
        //Taking User Input For X and Y Coordinates.
        System.out.println("Enter X1 Point Value of X-Coordinate:");
        int x1 = in.nextInt();
        System.out.println("Enter Y1 Point Value of Y-Coordinate:");
        int y1 = in.nextInt();
        System.out.println("Enter X2 Point Value of X-Coordinate:");
        int x2 = in.nextInt();
        System.out.println("Enter Y2 Point Value of Y-Coordinate:");
        int y2 = in.nextInt();

        //Calculating Length of Line1.
        double lengthOfLine_1 = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);
        System.out.println("Length of a Line1 is:" + lengthOfLine_1);

        return lengthOfLine_1;
    }
    //Calculating Length Of Line2.
    public double lengthOfLine2()
    {
        //Taking Inputs For Line 2.
        System.out.println("Enter X3 Point Value of X-Coordinate:");
        int x3 = in.nextInt();
        System.out.println("Enter Y3 Point Value of Y-Coordinate:");
        int y3 = in.nextInt();
        System.out.println("Enter X4 Point Value of X-Coordinate:");
        int x4 = in.nextInt();
        System.out.println("Enter Y4 Point Value of Y-Coordinate:");
        int y4 = in.nextInt();

        //Calculating Length Of Line2.
        double lengthOfLine_2 = Math.sqrt((x4 - x3)^2 + (y4 - y3)^2);
        System.out.println("Length of a Line2 is:" + lengthOfLine_2);

        return lengthOfLine_2;
    }
    //Comparing Length of Line1 and Line2.
    public void equalityOfLines(double lengthOfLine_1, double lengthOfLine_2)
    {
        //Converting double to String type.
        String l1 = String.valueOf(lengthOfLine_1);
        String l2 = String.valueOf(lengthOfLine_2);

        //Checking Equality of Two Lines By Using Equals Method.
        if (l1.equals(l2))
        {
            System.out.println("Length of Line1 and Line2 are Equal");
        }
        else
        {
            System.out.println("Length of Line1 and Line2 are Not Equal");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome To Line Comparison Computation Problem!");

        LineCompare obj = new LineCompare();
        double lengthOfLine1 = obj.lengthOfLine1();
        double lengthOfLine2 = obj.lengthOfLine2();
        obj.equalityOfLines(lengthOfLine1, lengthOfLine2);
    }
}
