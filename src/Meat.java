import java.io.Serializable;
import java.time.LocalDate;

public class Meat extends RawMaterial implements Discount , Serializable {
    private double weight;

    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost() * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().minusDays(7);
    }

    @Override
    public double getRealMoney() {
        if (getExpiryDate().isAfter(LocalDate.now().plusDays(3))) {
            return 0.7 * getAmount();
        } else if (getExpiryDate().isAfter(LocalDate.now().plusDays(5))) {
            return 0.5 * getAmount();
        } else return 0.9 * getAmount();
    }

    @Override
    public String toString() {
        return "Meat{" + super.toString() +
                "weight=" + weight +
                '}';
    }
}
