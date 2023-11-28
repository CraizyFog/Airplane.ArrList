import java.util.Arrays;

public class Airplane {
    private Plane[] arrPlane;

    public Airplane() {
        arrPlane = new Plane[]{};
    }

    void addPlane(Plane plane) {

        if (arrPlane.length == 0) {
            arrPlane = new Plane[1];
            arrPlane[0] = plane;
        } else {
            Plane[] arrPlanes = Arrays.copyOf(arrPlane, arrPlane.length + 1);
            arrPlanes[arrPlanes.length - 1] = plane;
            arrPlane = arrPlanes;
        }
    }
    public  int findPlane(Plane plane){
       // int index = -1;
        for (int i = 0; i <arrPlane.length ; i++) {
            if(arrPlane[i] == plane){
                return i;
            }
        }
        return -1;
    }
    public int allVolume(){
        int sum=0;
        for (int i = 0; i < arrPlane.length; i++) {
            if(arrPlane[i] instanceof TransportPlane current){
                sum += current.getMaxVolume();
            }
        }
        return sum;
    }

    public int allCarryingCapacity(){
        int sum=0;
        for (int i = 0; i < arrPlane.length; i++) {
            if(arrPlane[i] instanceof CargoPlane ){
                sum += ((CargoPlane) arrPlane[i]).getCarryingCapacity();
            }
        }
        return sum;
    }
    public void sayAllName(){
        for (Plane d:arrPlane) {
            d.sayMyName();
        }
    }
    protected void sayAllSkills(){
        for (Plane d:arrPlane) {
            d.sayMySkill();
        }
    }
    public void say(){
        sayAllSkills();
    }
    void sortPlane(){
        boolean isSorted = false;
        Plane buf;
        while(!isSorted){
            isSorted = true;
            for (int i = 0; i <arrPlane.length-1; i++) {
                if(arrPlane[i].getMaxFlyRange()>arrPlane[i+1].getMaxFlyRange()){
                    isSorted = false;
                    buf = arrPlane[i];
                    arrPlane[i] = arrPlane[i+1];
                    arrPlane[i+1] = buf;
                }
            }
        }
    }
    void removePlane(Plane plane) {
        int index = findPlane(plane);
        if(index != -1 ) {
            int j = 0;
            Plane[] arrPlanes = new Plane[arrPlane.length];
            for (int i = 0; i < arrPlanes.length; i++) {
                if (i != index) {
                    arrPlanes[j++] = arrPlane[i];
                }
            }
            arrPlane = Arrays.copyOf(arrPlanes, arrPlane.length - 1);
        }
    }
    public String searchHashCode(Plane plane){
        for (int i = 0; i < arrPlane.length; i++) {
            if(plane.hashCode() == arrPlane[i].hashCode()&&(arrPlane[i].equals(plane))){
                return "I see you plane\n"+ arrPlane[i].toString();
            }

        }
        return "I don`t see you plane";
    }
    public String searchPlaneByFuelConsPer(int search){
        String s =null;
        for (int i = 0; i < arrPlane.length; i++) {
            if((arrPlane[i].getFuelConsPer100Km() == search)&&(s==null)){
                s = arrPlane[i].getModel();

            }else if(arrPlane[i].getFuelConsPer100Km() == search) {
                s +=", " + arrPlane[i].getModel();
            }
        }
        return s;
    }

    @Override
    public String toString() {
        String arr = "";
        for (int i = 0; i < arrPlane.length; i++) {
            arr = arr + "\n" + arrPlane[i];
        }
        return arr;
    }
}
