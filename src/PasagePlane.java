import java.util.Objects;

public class PasagePlane extends Plane {
    private int capacity;

    public PasagePlane(String model, int maxFlyRange, int fuelConsPer100Km, int capacity) {
        super(model, maxFlyRange, fuelConsPer100Km);
        this.capacity = capacity;
    }

    @Override
    public void sayMyName() {
        System.out.println("i`m pasage plane");    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    protected void sayMySkill() {
        System.out.println("I am special because i can transport " + getCapacity() + " people");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PasagePlane that)) return false;
        return getCapacity() == that.getCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCapacity());
    }

    @Override
    public String toString() {
        return "PasagePlane{" +
                "\ncapacity " + capacity +
                "\nModel "+ getModel() +
                "\nMaxFlyRange " + getMaxFlyRange()+
                "\nFuelConsPer100km " + getFuelConsPer100Km() +
                "\n}";
    }
}
