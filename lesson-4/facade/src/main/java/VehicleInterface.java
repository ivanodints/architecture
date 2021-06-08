public class VehicleInterface {
    private Engine engine;
    private ElectricSystem electricSystem;
    private FuelSystem fuelSystem;

    public VehicleInterface(Engine engine, ElectricSystem electricSystem, FuelSystem fuelSystem) {
        this.engine = engine;
        this.electricSystem = electricSystem;
        this.fuelSystem = fuelSystem;
    }
    public void activateSystem (){
        electricSystem.onElectricSystem();
        engine.startEngine();
        fuelSystem.onFuelSystem();
    }

    public void deactivateSystem (){
        fuelSystem.offFuelSystem();
        engine.offEngine();
        electricSystem.offElectricSystem();
    }
}
