public class Main {
    public static void main(String[] args) {
        Vacation vacation = new Vacation();
        Transport transport1 = new Ship();
        vacation.goToVacation(transport1);
        Transport transport2 = new Airplane();
        vacation.goToVacation(transport2);
    }
}
