import java.lang.Math;
import java.util.Scanner;

public class Triangle {
    public static double TriangleAngle(float a, float b, float c){
        double a2 = Math.pow(a, 2);
        double b2 = Math.pow(b, 2);
        double c2 = Math.pow(c, 2);

        double Angle = Math.toDegrees(Math.acos((b2 + c2 - a2)/ (2*b*c)));

        return Angle;

    }

    public static double TriangleHeight(float a, float b, float c){
        // Calculate Semi-perimeter of the triangle

        float S = (a + b + c) / 2;

        // Calculate the area of the triangle

        double Area = Math.sqrt(S * (S - a) * (S - b) * (S - c));

        //Calculate the height given three side
        double Height = (2 * Area) / a;

        return Height;
    }
    public static void main(String[] args) {
        Scanner sidea = new Scanner(System.in);
        Scanner sideb = new Scanner(System.in);
        Scanner sidec = new Scanner(System.in);
        float SideA = 0;
        float SideB = 0;
        float SideC = 0;

        // Enter sidea
        try {
            System.out.println("Please pass triangle side a");
            SideA = sidea.nextFloat();
            System.out.println("Please pass triangle side b");
            SideB = sideb.nextFloat();
            System.out.println("Please pass triangle side c");
            SideC = sidec.nextFloat();
        } catch (Exception e){
            System.out.println(e);
        }


        //Condition check - valid triangle
        if (SideA < 0 || SideB < 0 || SideC < 0 ||
                SideA + SideB <= SideC || SideB + SideC <= SideA || SideA + SideC <= SideB ||
                        Math.abs(SideA - SideB) >= SideC || Math.abs(SideB - SideC) >= SideA || Math.abs(SideA - SideC) >= SideB) {
            System.out.println("Invalid Triangle");
            return;
        }

        double angleA = TriangleAngle(SideA,SideB,SideC);
        System.out.println("angle between side b and c: " + angleA);
        double heightA = TriangleHeight(SideA,SideB,SideC);
        System.out.println("Side of a : " + heightA);


        double angleB = TriangleAngle(SideB,SideC,SideA);
        System.out.println("angle between side a and c: " + angleB);
        double heightB = TriangleHeight(SideB,SideC,SideA);
        System.out.println("Side of b : " + heightB);

        double angleC = TriangleAngle(SideC,SideB,SideA);
        System.out.println("angle between side a and b: " + angleC);
        double heightC = TriangleHeight(SideC,SideB,SideA);
        System.out.println("Side of c : " + heightC);
    }
}
