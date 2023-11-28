import java.util.Objects;

public class SportPlane extends Plane {
    private int maxSpeed;

    public SportPlane(String model, int maxFlyRange, int fuelConsPer100Km, int maxSpeed) {
        super(model, maxFlyRange, fuelConsPer100Km);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void sayMySkill() {
        System.out.println("I am special because i can fly at speed " + getMaxSpeed() + " km/h");
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SportPlane that)) return false;
        return getMaxSpeed() == that.getMaxSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMaxSpeed());
    }

    @Override
    public void sayMyName() {
        System.out.println("i`m sport plane");
    }

    @Override
    public String toString() {
        return "SportPlane{" +
                "\nmaxSpeed " + maxSpeed +
                "\nModel "+ getModel() +
                "\nMaxFlyRange " + getMaxFlyRange()+
                "\nFuelConsPer100km " + getFuelConsPer100Km() +
                "\n}";
    }
}
