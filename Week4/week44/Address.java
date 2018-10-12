package week44;

public class Address{
    private String street = "";
    private String country = "";
    private String county = "";
    private String etc = "";

    public Address(String street, String country, String county, String etc) {
        this.street = street;
        this.country = country;
        this.county = county;
        this.etc = etc;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getEtc() {
        return etc;
    }

    public void setEtc(String etc) {
        this.etc = etc;
    }
}

