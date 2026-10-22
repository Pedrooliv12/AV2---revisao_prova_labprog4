package Q1;

public class PerishableProduct extends Product {
    private String validationDate;

    public PerishableProduct(String name, Double price, Integer quantity, String validationDate) {
        super(name, price, quantity);
        this.validationDate = validationDate;
    }

    @Override
    public String toString() {
        return super.toString() + "PerishableProduct{" + "validationDate=" + validationDate + '}';
    }

    public String getValidationDate() {
        return validationDate;
    }
}
