import java.math.BigDecimal;

public class DarkChocolate extends Chocolate {
    @Override
    public String getTaste() {
        taste = "Горький шоколад";
        return taste;
    }

    @Override
    public BigDecimal getPrice() {
        return BigDecimal.valueOf(5);
    }
}
