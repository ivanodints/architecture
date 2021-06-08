public class FacadeMain {
    public static void main(String[] args) {
        startApp();
    }

    public static void startApp(){
        System.out.println("ПАТТЕРН ФАСАД");
        ElectricSystem electricSystem = new ElectricSystem();
        Engine engine = new Engine();
        FuelSystem fuelSystem = new FuelSystem();

        VehicleInterface vehicleInterface = new VehicleInterface(engine, electricSystem, fuelSystem);
        electricSystem.onElectricSystem();
        engine.startEngine();
        fuelSystem.onFuelSystem();
        System.out.println("++++++");

    }
}
