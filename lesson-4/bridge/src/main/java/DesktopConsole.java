public class DesktopConsole implements ConsoleType {
    @Override
    public void connection() {
        System.out.println("Для подключения требуется внешний монитор");
    }
}
