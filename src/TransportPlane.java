import java.util.Objects;

public class TransportPlane extends Plane {
    private int maxVolume;

    public TransportPlane(String model, int maxFlyRange, int fuelConsPer100Km, int maxVolume) {
        super(model, maxFlyRange, fuelConsPer100Km);
        this.maxVolume = maxVolume;
    }

    @Override
    public String toString() {
        return "TransportPlane{" +
                "\nmaxVolume  " + maxVolume +
                "\nModel "+ getModel() +
                "\nMaxFlyRange " + getMaxFlyRange()+
                "\nFuelConsPer100km " + getFuelConsPer100Km() +
                "\n}";
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    @Override
    protected void sayMySkill() {
        System.out.println("I am special because i can transport " + getMaxVolume() + " m^3");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportPlane that)) return false;
        if (!super.equals(o)) return false;
        return getMaxVolume() == that.getMaxVolume();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaxVolume());
    }

    @Override
    public void sayMyName() {
        System.out.println("i`m transport plane");
    }
}
