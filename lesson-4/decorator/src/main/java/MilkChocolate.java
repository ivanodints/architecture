import java.math.BigDecimal;

public class MilkChocolate extends Chocolate{
    @Override
    public String getTaste() {
        taste = "Сладкий шоколад";
        return taste;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(3);
    }
}
