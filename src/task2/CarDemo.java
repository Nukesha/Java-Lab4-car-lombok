package task2;

public class CarDemo {
    public static void main(String[] args) {
        Car car = new Car("GLE", "Mercedes", 2020, 350_000, "white", 5);

        System.out.println(car);          // toString
        car.sell();                       // quantity 5 -> 4

        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("black");            // change some fields
        car.setPrice(330_000);

        System.out.println(car);          // see the changes
    }
}
