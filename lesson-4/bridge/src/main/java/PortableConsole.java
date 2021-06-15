public class PortableConsole implements ConsoleType{
    @Override
    public void connection() {
        System.out.println("Для подключения НЕ требуется монитор. Играем где хотим");
    }
}
