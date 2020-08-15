public class Circle extends Shape {
    final protected double Pi = 3.14;
    protected double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double Radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = Pi*radius*radius;
        return area;
    }

    public double getPerimeter() {
        double perimeter = 2 * Pi * radius;
        return perimeter;
    }

    public String toString() {
        String str = "Circle[" + "radius=" + radius + ",color=" + color + ", filled=" + filled + "]";
        return str;
    }
    public static void main(String[] args) {
        Circle circle = new Circle(3, "black", true);
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getColor());
        System.out.println(circle.isFilled());
    }
}