public class Vehicle {
    public DriveStrategy driveobject ;
    Vehicle(DriveStrategy driveobj) {
        this.driveobject = driveobj;
    }
    void drive() {
        driveobject.drive();
    }
}