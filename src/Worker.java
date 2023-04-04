public class Worker implements IPosition{

    String position;

    public Worker(String position) {
        this.position = position;
    }

    @Override
    public void setPosition() {

        System.out.println("Должность: " + position);

    }
}
