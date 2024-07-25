public class Main {
    public static void main(String[] args) {
        Vehicle x = new GoodsVehicle();
        x.drive();
        Vehicle y = new OffRoadVehicle();
        y.drive();
    }
}