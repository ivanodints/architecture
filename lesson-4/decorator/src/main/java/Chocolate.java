import java.math.BigDecimal;

public abstract class Chocolate {
    String taste;

    public String getTaste() {
        return taste;
    }

    public abstract BigDecimal getPrice();
}
