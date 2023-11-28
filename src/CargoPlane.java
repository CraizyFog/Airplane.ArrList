import java.util.Objects;

public class CargoPlane extends Plane {
    private int carryingCapacity;

    public CargoPlane(String model, int maxFlyRange, int fuelConsPer100Km, int carryingCapacity) {
        super(model, maxFlyRange, fuelConsPer100Km);
        this.carryingCapacity = carryingCapacity;
    }

    @Override
    public void sayMyName() {
        System.out.println("i`m cargo plane");
    }

    @Override
    protected void sayMySkill() {
        System.out.println("I am special because i can transport " + getCarryingCapacity() + " kg");
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "\ncarryingCapacity " + carryingCapacity +
                "\nModel "+ getModel() +
                "\nMaxFlyRange " + getMaxFlyRange()+
                "\nFuelConsPer100km " + getFuelConsPer100Km() +
                "\n}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoPlane that)) return false;
        return getCarryingCapacity() == that.getCarryingCapacity();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCarryingCapacity());
    }

    public int getCarryingCapacity() {
        return carryingCapacity;
    }

    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
}

