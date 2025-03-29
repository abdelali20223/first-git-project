package day03;

public class Computer {

    public String model;
    public int price;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
