package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor(); // 추가
        System.out.println("======");
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillup();
        gasCar.openDoor(); // 추가
        System.out.println("======");
        HydrogenCar hydrogenCar = new HydrogenCar(); // 새로 생성
        hydrogenCar.move();
        hydrogenCar.fillHydrogen();
        hydrogenCar.openDoor();
    }
}
