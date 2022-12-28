import com.pravin.Car;

public class Mercidcez600  extends Car {

    boolean hasMassageSitting;
    boolean hasSunroof;

    public Mercidcez600(int wheel, int cc, String color, boolean hasMassageSitting, boolean hasSunroof) {
        super(wheel, cc, color);
        this.hasMassageSitting = hasMassageSitting;
        this.hasSunroof = hasSunroof;
    }

    public boolean isHasMassageSitting() {
        return hasMassageSitting;
    }

    public void setHasMassageSitting(boolean hasMassageSitting) {
        this.hasMassageSitting = hasMassageSitting;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    @Override
    public String toString() {
        return "Mercidcez600{" +
                "hasMassageSitting=" + hasMassageSitting +
                ", hasSunroof=" + hasSunroof +
                '}' + super.toString();
    }
}
