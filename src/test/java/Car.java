public class Car {
    private String brand;
    private String model;
    private int mnfDate;

    // creating a constructor
    public Car(String brand, String model, int mnfDate) {
        this.brand = brand;
        this.model = model;
        this.mnfDate = mnfDate;
    }

    //printing car info
    public void displayCarInfo() {
        System.out.println("Car brand: " + brand);
        System.out.println("Car model: " + model);
        System.out.println("Car manufacturing date: " + mnfDate);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", 2019);
        Car car2 = new Car("Cadillac", "Escalade", 2022);

        car1.displayCarInfo();
        System.out.println("______________________________");
        car2.displayCarInfo();
    }
}

