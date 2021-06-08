import java.math.BigDecimal;

public class Nut extends ChocolateDecorator {
    Chocolate chocolate;

    public Nut(Chocolate chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public String getTaste() {
        String taste = chocolate.getTaste() + " с орехами";
        return taste;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(0.5).add(chocolate.getPrice());
    }
}
