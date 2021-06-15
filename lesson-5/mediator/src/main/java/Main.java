public class Main {
    public static void main(String[] args) {

        CarControlPanel controlPanelMediator = new CarControlPanel(new Accumulator());
        Car car = new Car(controlPanelMediator);
        car.start();
    }
}
