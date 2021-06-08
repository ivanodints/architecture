public class NintendoSwitch extends GameConsole{

    private ConsoleType consoleType;

    public NintendoSwitch(ConsoleType consoleType) {
        this.consoleType = consoleType;
    }

    @Override
    public void playVideoGame() {
        consoleType.connection();
        System.out.println("Наслаждаемся игрой");
    }
}
