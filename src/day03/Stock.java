package day03;

public class Stock {
    public String name;
    public String company;
    public double price ;

    public Stock(String name, double price, String company) {
        this.name = name;
        this.price = price;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", price= $" + price +
                '}';
    }
}
