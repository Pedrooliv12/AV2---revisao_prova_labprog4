package Q1;

public abstract class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Q1.Product{" + "name=" + name + ", price=" + price + ", quantity=" + quantity + '}';
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sell(int sellValue) {

        if (this.quantity < sellValue || sellValue <= 0) {
            throw new IllegalArgumentException("Alerta: sem estoque do produto " +  this.name + " ou o valor digitado é negativo!");
        }

        this.quantity -= sellValue;

        if (this.quantity < 7) {
            System.out.println("Alerta: Repor estoque do produto " + this.name);
        }
    }
}
