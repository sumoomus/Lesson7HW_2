public class Director implements Employee {
    @Override
    public void printPosition() {
        System.out.println("Директор");
        Employee director = new Director();
        director.printPosition();
    }
}
