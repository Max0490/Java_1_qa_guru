package guru.qa;

import java.util.List;
import java.util.Set;

public class PhoneExample {

    public static void main(String[] args) {
        Phone samsung = new Phone(900, "Samsung", true);
        samsung.setSupportedOsVersions(Set.of("12", "13"));

        Phone iPhone = new Phone(1000, "iPhone", false);
        iPhone.setSupportedOsVersions(Set.of("14", "15", "16"));

        System.out.println("Supported OS count: " + iPhone.supportedOsVersions.size());

        for (int i = 0; i < iPhone.supportedOsVersions.size(); i++) {
            System.out.println("OS version: " + iPhone.supportedOsVersions[i]);
        }

        System.out.println("foreach");

        for (String osVersion : iPhone.supportedOsVersions) {
            System.out.println("OS version: " + osVersion);
        }


        int arrIndex = 0;
        while (arrIndex < iPhone.supportedOsVersions.length) {
            System.out.println("OS Version: " + iPhone.supportedOsVersions[arrIndex]);
            arrIndex++;
        }


        Phone sony = new Phone();
        sony.setPhoneName("Sony XPERIA");
        sony.setPrice(800);
        sony.setAndroidPhone(true);
        //iPhone.isInCase(true); //уточнить

        //System.out.println(samsung.getPhoneName());
      //  System.out.println(iPhone.getPhoneName());

    }
}
