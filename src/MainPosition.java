public class MainPosition {
    public static void main(String[] args) {
        Director director = new Director("директор");
        director.setPosition();

        Worker worker = new Worker("рабочий");
        worker.setPosition();

        Accountant accountant = new Accountant("бухгалтер");
        accountant.setPosition();


    }
}
