enum Seasons {

    WINTER("I love winter"),

    SUMMER(" I hate summer"),

    MONSOON("monsoon is oky ");

    String msg;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    Seasons(String msg) {
        this.msg = msg;
    }
}
    public class Main {

        public static void main(String[] args) {
            for (Seasons season : Seasons.values()) {
                System.out.println(season.name() + " " + season.msg);
            }
        }
    }

