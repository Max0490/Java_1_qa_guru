package guru.qa;

public class Phone {
    int price;
    String phoneName;
    boolean isAndroidPhone;
    boolean isInCase;


    public Phone(int price, String phoneName, boolean isAndroidPhone) {
        this.price = price;
        this.phoneName = phoneName;
        this.isAndroidPhone = isAndroidPhone;
    }

    public Phone() {
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void setAndroidPhone(boolean androidPhone) {
        isAndroidPhone = androidPhone;
    }

    public String getPhoneName() {
        return phoneName;
    }


}
