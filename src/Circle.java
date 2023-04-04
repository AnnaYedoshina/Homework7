public class Circle extends Figure {
    String name = "Circle";
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    double getPerimeter() {
        double perimeterCircle = (2 * Math.PI * radius);
        return perimeterCircle;
    }

    double getRadius() {
        return radius;

    }

    void setRadius(double radius) {
        this.radius = radius;
    }
}
