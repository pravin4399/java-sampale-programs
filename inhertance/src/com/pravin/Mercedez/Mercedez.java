package com.pravin.Mercedez;

public class Mercedez {

    boolean hasMassageSeating;
    boolean hasSunRoof;

    public Mercedez(boolean hasMassageSeating, boolean hasSunRoof) {
        this.hasMassageSeating = hasMassageSeating;
        this.hasSunRoof = hasSunRoof;
    }

    public boolean isHasMassageSeating() {
        return hasMassageSeating;
    }

    public void setHasMassageSeating(boolean hasMassageSeating) {
        this.hasMassageSeating = hasMassageSeating;
    }

    public boolean isHasSunRoof() {
        return hasSunRoof;
    }

    public void setHasSunRoof(boolean hasSunRoof) {
        this.hasSunRoof = hasSunRoof;
    }

    @Override
    public String toString() {
        return "mercedez{" +
                "hasMassageSeating=" + hasMassageSeating +
                ", hasSunRoof=" + hasSunRoof +
                '}';
    }
}
