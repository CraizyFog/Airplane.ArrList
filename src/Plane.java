import java.util.Objects;

public abstract class Plane {
    private String model;
    private int maxFlyRange;
    private int fuelConsPer100Km;
    public Plane(){}
    public Plane(String model, int maxFlyRange, int fuelConsPer100Km){
        this.model= model;
        this.fuelConsPer100Km =fuelConsPer100Km;
        this.maxFlyRange = maxFlyRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plane plane)) return false;
        return getMaxFlyRange() == plane.getMaxFlyRange() && getFuelConsPer100Km() == plane.getFuelConsPer100Km() && Objects.equals(getModel(), plane.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getMaxFlyRange(), getFuelConsPer100Km());
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxFlyRange() {
        return maxFlyRange;
    }

    public void setMaxFlyRange(int maxFlyRange) {
        this.maxFlyRange = maxFlyRange;
    }

    public int getFuelConsPer100Km() {
        return fuelConsPer100Km;
    }

    public void setFuelConsPer100Km(int fuelConsPer100Km) {
        this.fuelConsPer100Km = fuelConsPer100Km;
    }
    public void sayMyName(){
        System.out.println("i`m boring plane");
    }
    protected void sayMySkill(){
        System.out.println("I have no particularity ");
    }
}

