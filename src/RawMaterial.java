import java.io.Serializable;
import java.time.LocalDate;

public abstract class RawMaterial implements Serializable {
    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public RawMaterial(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public abstract double getAmount();


    public abstract LocalDate getExpiryDate();

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    @Override
    public String toString() {
        return "RawMaterial{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }
}
