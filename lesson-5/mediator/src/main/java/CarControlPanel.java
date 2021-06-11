public class CarControlPanel implements ControlPanelMediator{
    private Car car;
    private Accumulator accumulator;

    public CarControlPanel(Accumulator accumulator) {
        this.accumulator = accumulator;
    }

    @Override
    public void startSystem() {
        accumulator.startIgnition();

    }

    @Override
    public void ofSystem() {
        accumulator.offSystem();
    }


}
