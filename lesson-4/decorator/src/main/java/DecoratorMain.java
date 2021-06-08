public class DecoratorMain {
    public static void main(String[] args) {
        startApp();
    }

    public static void startApp(){
        System.out.println("ПАТТЕРН ДЕКОРАТОР");
        Chocolate chocolate = new MilkChocolate();
        chocolate = new Nut(chocolate);
        System.out.println(chocolate.getTaste());
        System.out.println(chocolate.getPrice());
        System.out.println("------");
        Chocolate chocolate1 = new DarkChocolate();
        chocolate1 = new Nut(chocolate1);
        System.out.println(chocolate1.getTaste());
        System.out.println(chocolate1.getPrice());
        System.out.println("++++++");
    }
}
