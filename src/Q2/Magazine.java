package Q2;

public class Magazine extends Publication {
    private Integer editionNumber;
    private String mounthPublicationDate;

    public Magazine(String title, String idetificationCode, Integer quantity, Integer editionNumber, String mounthPublicationDate) {
        super(title, idetificationCode, quantity);
        this.editionNumber = editionNumber;
        this.mounthPublicationDate = mounthPublicationDate;
    }

    @Override
    public int getReturnPeriod() {
        return 7;
    }

    public Integer getEditionNumber() {
        return editionNumber;
    }

    public String getMounthPublicationDate() {
        return mounthPublicationDate;
    }

    @Override
    public String toString() {
        return super.toString() + "Magazine{" + "editionNumber=" + editionNumber + ", mounthPublicationDate=" + mounthPublicationDate + '}';
    }
}
