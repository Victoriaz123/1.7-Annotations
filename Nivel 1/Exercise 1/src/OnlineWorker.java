public class OnlineWorker extends Worker{

private static final double INTERNET_RATE = 20.0;


    public OnlineWorker(String name, String lastname, double pricePerHour) {
        super(name, lastname, pricePerHour);
    }


    @Override
    public double calculateSalary(double hours) {
        return super.calculateSalary(hours) + INTERNET_RATE;
    }

}
