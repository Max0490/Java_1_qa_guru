package guru.qa;

import com.sun.source.doctree.SeeTree;

import java.util.List;
import java.util.Set;

public class Phone {
    int price;
    String phoneName;
    boolean isAndroidPhone;
    boolean isInCase;
    Set<String> supportedOsVersions;




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

    public void setInCase(boolean inCase) {
        isInCase = inCase;
    }

    public void setSupportedOsVersions(Set<String> supportedOsVersions) {
        this.supportedOsVersions = supportedOsVersions;
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
