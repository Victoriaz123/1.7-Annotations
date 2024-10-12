public class OnsiteWorker extends Worker {
    private static double petrol = 10.0;

    public OnsiteWorker(String name, String lastname, double pricePerHour) {
        super(name, lastname, pricePerHour);
    }

    public static void setPetrol(double petrol) {
        OnsiteWorker.petrol = petrol;
    }

    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + petrol;
    }
}
