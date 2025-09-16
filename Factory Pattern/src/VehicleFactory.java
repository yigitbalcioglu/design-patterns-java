public abstract class VehicleFactory {
    // Factory Method
    public abstract Vehicle createVehicle();

    public void useVehicle() {
        Vehicle vehicle = createVehicle();
        vehicle.drive();
    }
}
