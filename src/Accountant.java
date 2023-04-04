public class Accountant implements IPosition {
    String position;

    public Accountant(String position) {
        this.position = position;
    }

    @Override
    public void setPosition() {

        System.out.println("Должность: " + position);

    }
}
