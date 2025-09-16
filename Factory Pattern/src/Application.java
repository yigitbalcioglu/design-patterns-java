public class Application {
    public static void main(String[] args) {
        // Otomobil üret
        VehicleFactory carFactory = new CarFactory();
        carFactory.useVehicle(); // Otomobil sürülüyor...

        // Kamyon üret
        VehicleFactory truckFactory = new TruckFactory();
        truckFactory.useVehicle(); // Kamyon sürülüyor...
    }
}

