import java.io.Serializable;

public class PhoneNumber implements Serializable {
    int countryCode;
    int cityCode;
    int abonentCode;

    public PhoneNumber(int countryCode, int cityCode, int abonentCode) {
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.abonentCode = abonentCode;
    }

    @Override
    public String toString() {
        return "Phone number: {Country code: " +  countryCode + " " +
               "City code: " + cityCode + " " +
               "Abonent code: " + abonentCode + "}";
    }
}
