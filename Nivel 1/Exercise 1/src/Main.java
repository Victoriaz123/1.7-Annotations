public class Main {
    public static void main(String[] args) {

        OnsiteWorker onsiteWorker = new OnsiteWorker("Bill", "Jones", 15.0);
        double onsiteSalary = onsiteWorker.calculateSalary(100);
        System.out.println("On-Site Worker Salary: " + onsiteSalary);

        OnlineWorker onlineWorker = new OnlineWorker("John", "Smith", 20.0);
        double onlineSalary = onlineWorker.calculateSalary(100);
        System.out.println("Online Worker Salary: " + onlineSalary);

    }
}
