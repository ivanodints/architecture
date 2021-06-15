public class PS5 extends GameConsole {

    private ConsoleType consoleType;

    public PS5(ConsoleType consoleType) {
        this.consoleType = consoleType;
    }

    @Override
    public void playVideoGame() {
        consoleType.connection();
        System.out.println("Наслаждаемся игрой");
    }
}
