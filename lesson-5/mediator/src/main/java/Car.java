public class Car {

    public CarControlPanel carControlPanel;

    public Car(CarControlPanel carControlPanel) {
        this.carControlPanel = carControlPanel;
    }

    public void start(){
        carControlPanel.startSystem();
    }
    public void off(){
        carControlPanel.ofSystem();
    }


}
