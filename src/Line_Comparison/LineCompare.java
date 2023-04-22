package Line_Comparison;
import javax.sound.sampled.Line;
import java.util.Scanner;
import java.lang.Math;


public class LineCompare
{
    //Calculating Length of Line1.
    public double lengthOfLine1(double p1)
    {
        //Calculating Length of Line1.
        double lengthOfLine_1 = Math.sqrt(p1);
        System.out.println("Length of a Line1 is:" + lengthOfLine_1);
        return lengthOfLine_1;
    }
    //Calculating Length Of Line2.
    public double lengthOfLine2(double p2)
    {
        //Calculating Length Of Line2.
        double lengthOfLine_2 = Math.sqrt(p2);
        System.out.println("Length of a Line2 is:" + lengthOfLine_2);
        return lengthOfLine_2;
    }
    //Comparing Length of Line1 and Line2.
    public void compareTwoLines(double lengthOfLine1, double lengthOfLine2)
    {
        //Converting double to String type.
        String l1 = String.valueOf(lengthOfLine1);
        String l2 = String.valueOf(lengthOfLine2);

        //Checking Equality of Two Lines By Using Equals Method.
        if (l1.compareTo(l2) > 0)
        {
            System.out.println("Length of Line1 is Greater than Line2");
        }
        else if (l1.compareTo(l2) < 0)
        {
            System.out.println("Length of Line2 is Greater Than Line1");
        }
        else
        {
            System.out.println("Length of Line1 and Line2 Both Are Equal");
        }
    }
    public static void main(String[] args)
    {
        System.out.println("Welcome To Line Comparison Computation Problem!");


        double p1, p2;//Power Of Line1 and Line2
        Scanner in = new Scanner(System.in);

        //Taking User Input For X and Y Coordinates.
        //Input For Line1
        System.out.println("Enter X1 Point Value of X-Coordinate:");
        int x1 = in.nextInt();
        System.out.println("Enter Y1 Point Value of Y-Coordinate:");
        int y1 = in.nextInt();
        System.out.println("Enter X2 Point Value of X-Coordinate:");
        int x2 = in.nextInt();
        System.out.println("Enter Y2 Point Value of Y-Coordinate:");
        int y2 = in.nextInt();

        double v1 = Math.pow((x2 - x1), 2);
        double v2 = Math.pow((y2 - y1), 2);

        p1 = v1 + v2;

        //Taking Inputs For Line 2.
        System.out.println("Enter X3 Point Value of X-Coordinate:");
        int x3 = in.nextInt();
        System.out.println("Enter Y3 Point Value of Y-Coordinate:");
        int y3 = in.nextInt();
        System.out.println("Enter X4 Point Value of X-Coordinate:");
        int x4 = in.nextInt();
        System.out.println("Enter Y4 Point Value of Y-Coordinate:");
        int y4 = in.nextInt();

        double v3 = Math.pow((x4 - x3), 2);
        double v4 = Math.pow((y4 - y3), 2);

        p2 = v3 + v4;

        LineCompare obj = new LineCompare();
        double lengthOfLine1 = obj.lengthOfLine1(p1);
        double lengthOfLine2 = obj.lengthOfLine2(p2);
        obj.compareTwoLines(lengthOfLine1, lengthOfLine2);

    }
}
