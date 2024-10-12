public class Worker{

    private String name;
    private String lastname;
    private double pricePerHour;

    public Worker(String name, String lastname, double pricePerHour) {
        this.name = name;
        this.lastname = lastname;
        this.pricePerHour = pricePerHour;
    }


    public double calculateSalary(double hours){
        return hours* pricePerHour;
    }

}
