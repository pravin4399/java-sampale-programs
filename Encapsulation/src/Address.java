public class Address {
    public String flatNumber;
    public String society;
    public int pinCode;




    public Address() {
    }

    public String getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(String flatNumber) {
        this.flatNumber = flatNumber;
    }

    public String getSociety() {
        return society;
    }

    public void setSociety(String society) {
        this.society = society;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }
    public static Address getInstance(){
        return new Address();
    }


    @Override
    public String toString() {
        return "Address{" +
                "flatNumber='" + flatNumber + '\'' +
                ", society='" + society + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
