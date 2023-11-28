// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        PasagePlane pasagePlane= new PasagePlane("AG-45",50,567,678);
        TransportPlane transportPlane = new TransportPlane("GG-67",45,130,67);
        CargoPlane cargoPlane = new CargoPlane("GH-87",456,354,45);
        SportPlane sportPlane = new SportPlane("Ra-1",54,456,875);
        TransportPlane transportPlane1 = new TransportPlane("GF-67",67,130,324);
        CargoPlane cargoPlane1 = new CargoPlane("GH-90",678,231,897);
        Airplane airplanes = new Airplane();
//        airplanes.addPlane(pasagePlane);
//        airplanes.addPlane(transportPlane);
//        airplanes.addPlane(cargoPlane);
//        airplanes.addPlane(sportPlane);
//        airplanes.addPlane(transportPlane1);
//        airplanes.addPlane(cargoPlane1);
//        airplanes.removePlane(pasagePlane);
//        System.out.println(airplanes);
//        airplanes.sortPlane();
//        System.out.println("*************************************");
//        System.out.println(airplanes);
//        airplanes.sayAllName();
//        airplanes.say();
//        System.out.println(airplanes.searchPlaneByFuelConsPer(130));
//        System.out.println(airplanes.searchHashCode(pasagePlane));
        MyArrayList arrayList = new MyArrayList(20);
//        arrayList.add(cargoPlane);
//        arrayList.add(sportPlane, 8);
//        System.out.println(arrayList.getLast());
        Plane[] arrTest = new Plane[4];
        arrTest[0] = cargoPlane1;
        arrTest[1] = cargoPlane;
        arrTest[2] = sportPlane;
        arrTest[3] = transportPlane1;
//        arrayList.addAll(arrTest,4);
        arrayList.addAll(arrTest);
//        arrayList.vyvod();
//        System.out.println(arrayList.size());
        arrayList.remove(2);
//        arrayList.vyvod();
    }
}
