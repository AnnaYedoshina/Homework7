public class Triangle extends Figure {
    String name = "Triangle";
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        double area = Math.sqrt((p - sideA) * (p - sideB) * (p - sideC));
        return area;
    }

    String getName() {
        return name;
    }

    @Override
    double getPerimeter() {
        double perimeterTriangle = (sideA + sideB + sideC);
        return perimeterTriangle;
    }

    double getSideA() {
        return sideA;
    }

    void setSideA(double sideA) {
        this.sideA = sideA;

    }

    double getSideB() {
        return sideB;
    }

    void setSideB(double sideB) {
        this.sideB = sideB;
    }

    double getSideC() {
        return sideC;

    }

    void setSideC(double sideC) {
        this.sideC = sideC;
    }
}
