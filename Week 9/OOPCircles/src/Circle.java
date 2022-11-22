public class Circle {
    private double radius;
    private String color;
    private double area;

    public Circle(double radius, String color) {
        setRadius(radius);
        setColor(color);
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        area = Math.PI * this.radius * this.radius;

        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }


}


