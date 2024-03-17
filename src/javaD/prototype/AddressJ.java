package javaD.prototype;

public class AddressJ {

    String building;
    String StreetName;
    String City;

    public AddressJ(String building, String streetName, String city) {
        this.building = building;
        StreetName = streetName;
        City = city;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getStreetName() {
        return StreetName;
    }

    public void setStreetName(String streetName) {
        StreetName = streetName;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    @Override
    public String toString() {
        return "AddressJ{" +
                "building='" + building + '\'' +
                ", StreetName='" + StreetName + '\'' +
                ", City='" + City + '\'' +
                '}';
    }
}
