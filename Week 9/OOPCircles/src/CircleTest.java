public class CircleTest {
    public static void main(String[] args) {
        Circle Circle01 = new Circle(1.0, "Red");
        Circle Circle02 = new Circle(4.5, "Green");
        Circle Circle03 = new Circle(3.2, "Blue");


        System.out.println("Radius: " + Circle01.getRadius() + ", Color: " + Circle01.getColor() + ", Area: " + Circle01.getArea());
        System.out.println("Radius: " + Circle02.getRadius() + ", Color: " + Circle02.getColor() + ", Area: " + Circle02.getArea());
        System.out.println("Radius: " + Circle03.getRadius() + ", Color: " + Circle03.getColor() + ", Area: " + Circle03.getArea());
    }
}
