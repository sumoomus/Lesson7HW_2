public class Worker implements Employee {
    @Override
    public void printPosition() {
        System.out.println("Рабочий");
        Employee worker = new Worker();
        worker.printPosition();
    }
}
