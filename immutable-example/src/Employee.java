public class Employee {

    private final String name;
    private final int id;
    private final int salary;
    private final Address address;

    public Employee(String name, int id, int salary, Address address) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = new Address(address.flatNum, address.lane1, address.lane2
                , address.city, address.postCode);//deep clone

    }
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public Address getAddress() {
        return new Address(address.flatNum, address.lane1,
                address.lane2, address.city, address.postCode);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}