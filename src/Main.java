public class Main {
    public static void main(String[] args) {
        Figure[] figure = {new Rectangle(5, 7),
                new Circle(10),
                new Triangle(3, 4, 2),
                new Circle(5),
                new Rectangle(3, 4)};
        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea() + fig.getPerimeter() +
                    ": perimeter = " + fig.getPerimeter());
        int r = 0;
        for (int i = 0; i < figure.length; i++) {
            r += figure[i].getPerimeter();


        }System.out.println("Сумма " + r);

    }
}

