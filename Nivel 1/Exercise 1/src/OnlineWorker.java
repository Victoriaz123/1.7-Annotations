public class OnlineWorker extends Worker{

private static final double internetRate = 20.0;


    public OnlineWorker(String name, String lastname, double pricePerHour) {
        super(name, lastname, pricePerHour);
    }


    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + internetRate;
    }

}
