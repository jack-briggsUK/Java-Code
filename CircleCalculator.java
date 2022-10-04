package Code;
/**
 * CircleCalculator
 */
public class CircleCalculator {
    public static void main(String[] args) {
        double circleRadius = 12.0;
        double circleArea = 3.14 * (circleRadius * circleRadius);

        double circleDiameter = (2*circleRadius);
        double circleCircumfrance = 3.14 * 2 * circleDiameter;
        
        System.out.print("Radius = " + circleRadius);
        System.out.print(", Diameter = "+circleDiameter);
        System.out.print(", Circumfrance = "+circleCircumfrance);
        System.out.print(", Area = " + circleArea + ".");
    }

}