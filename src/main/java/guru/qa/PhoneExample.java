package guru.qa;

public class PhoneExample {

    public static void main(String[] args) {
        Phone samsung = new Phone(900, "Samsung", true);
        Phone iPhone = new Phone(1000, "iPhone", false);
        Phone sony = new Phone();
        sony.setPhoneName("Sony XPERIA");
        sony.setPrice(800);
        sony.setAndroidPhone(true);
        iPhone.isInCase(true); //уточнить




        System.out.println(samsung.getPhoneName());
        System.out.println(iPhone.getPhoneName());

    }
}
