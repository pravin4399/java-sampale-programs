public class MainDriver {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.powerOn();
        laptop.displayDocument();
        laptop.powerOff();

        Printer printer =new Printer();
        printer.print();
        printer.powerOn();
        printer.powerOff();

        // upcasting

        Machine machine = new Machine();
        machine.powerOff();
        machine.powerOn();

    }

}
