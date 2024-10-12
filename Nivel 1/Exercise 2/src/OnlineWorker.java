public class OnlineWorker extends Worker{
    private static final double internetRate = 20.0;

    public OnlineWorker(String name, String lastname, double pricePerHour) {
        super(name, lastname, pricePerHour);
    }


    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + internetRate;
    }

    @Deprecated
    public void oldMethod() {
        System.out.println("This is an old method.");
    }
}
