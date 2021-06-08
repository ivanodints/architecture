public class AdapterMain {
    public static void main(String[] args) {
        startApp();
    }

    public static void startApp() {
        System.out.println("ПАТТЕРН АДАПТЕР");
        AdatpterDVItoHDMI adatpterDVItoHDMI = new AdatpterDVItoHDMI(new CableDVI());
        adatpterDVItoHDMI.doHDMIconnection();
        System.out.println("++++++");
    }
}
