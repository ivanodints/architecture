public class BridgeMain {
    public static void main(String[] args) {
        starApp();
    }

    public static void starApp() {
        System.out.println("ПАТТЕРН МОСТ");
        PS5 ps5 = new PS5(new DesktopConsole());
        ps5.playVideoGame();
        System.out.println("------");
        NintendoSwitch nintendoSwitch = new NintendoSwitch(new PortableConsole());
        nintendoSwitch.playVideoGame();
        System.out.println("++++++");
    }
}
