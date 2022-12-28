import com.pravin.Car;

public class Alto extends Car {
    boolean hasAirbag;
    boolean hasSunroof;

    public Alto(int wheel, int cc, String color, boolean hasAirbag, boolean hasSunroof) {
        super(wheel, cc, color);
        this.hasAirbag = hasAirbag;
        this.hasSunroof = hasSunroof;
    }

    public boolean isHasAirbag() {
        return hasAirbag;
    }

    public void setHasAirbag(boolean hasAirbag) {
        this.hasAirbag = hasAirbag;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    @Override
    public String toString() {
        return "Alto{" +
                "hasAirbag=" + hasAirbag +
                ", hasSunroof=" + hasSunroof +
                '}' + super.toString();
    }
}
