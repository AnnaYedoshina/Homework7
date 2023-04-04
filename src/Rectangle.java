public class Rectangle extends Figure {

    String name = "Rectangle";
    double width;
    double height;

    public Rectangle(double width, double heiht) {
        this.width = width;
        this.height = heiht;
    }

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    double getPerimeter() {
        double perimeterRectangle = (height + width) * 2;
        return perimeterRectangle;
    }

    double getWidth() {
        return width;

    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }
}
