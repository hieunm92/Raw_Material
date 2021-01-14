import java.io.Serializable;
import java.time.LocalDate;

public class CrispyFlour extends RawMaterial implements Discount, Serializable {
    private int quantity;

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }


    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusMonths(4))) {
            return 0.8 * getAmount();
        } else if (getExpiryDate().isAfter(LocalDate.now().plusMonths(2))) {
            return 0.6 * getAmount();
        } else return 0.95 * getAmount();
    }


    @Override
    public String toString() {
        return "CrispyFlour{" + super.toString() +
                "quantity=" + quantity +
                '}';
    }
}
