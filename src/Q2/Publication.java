package Q2;

public abstract class Publication {
    private String title;
    private String indetificationCode;
    private Integer quantity;

    public Publication(String title, String indetificationCode, Integer quantity) {
        this.title = title;
        this.indetificationCode = indetificationCode;
        this.quantity = quantity;
    }

    public abstract int getReturnPeriod();

    public void lendBook(Integer quantityValue) {
        this.quantity -= quantityValue;
    }

    public void returnBook(Integer quantityValue) {
        this.quantity += quantityValue;
    }

    public String getTitle() {
        return title;
    }

    public String getIndetificationCode() {
        return indetificationCode;
    }

    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Publication{title=" + title + ", code=" + indetificationCode + ", quantity=" + quantity + "}";
    }
}
