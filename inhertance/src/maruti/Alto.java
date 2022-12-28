package maruti;

import com.pravin.inheritance.Car;

public class Alto  extends Car {
    boolean hasAirBag;
    int numOfAirBag;

    public Alto(int cc, int wheel, String color, boolean hasAirBag, int numOfAirBag) {
        super(cc, wheel, color);
        this.hasAirBag = hasAirBag;
        this.numOfAirBag = numOfAirBag;
    }

    public boolean isHasAirBag() {
        return hasAirBag;
    }

    public void setHasAirBag(boolean hasAirBag) {
        this.hasAirBag = hasAirBag;
    }

    public int getNumOfAirBag() {
        return numOfAirBag;
    }

    public void setNumOfAirBag(int numOfAirBag) {
        this.numOfAirBag = numOfAirBag;
    }

    @Override
    public String toString() {
        return "Alto{" +
                "hasAirBag=" + hasAirBag +
                ", numOfAirBag=" + numOfAirBag +
                " "+super.toString()+
                '}';
    }
}
