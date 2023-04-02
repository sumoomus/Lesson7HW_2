public class Accountant implements Employee{
    @Override
    public void printPosition() {
        System.out.println("Бухгалтер");
        Employee accountant = new Accountant();
        accountant.printPosition();
    }
}
