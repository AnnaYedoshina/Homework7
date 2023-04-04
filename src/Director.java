public class Director implements IPosition {
    String position;

    public Director(String position) {
        this.position = position;
    }

    @Override
    public void setPosition() {

        System.out.println("Должность: " + position);

    }
}

