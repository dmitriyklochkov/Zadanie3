
class Employee {

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        id = nextId;  // set id to next available id
        nextId++;
    }

    public static int getNextId() {
        return nextId;  // returns static field
    }

    public static void main(String[] args)  // unit test
    {
        Employee e = new Employee("Harry", 50000);
        System.out.println(e.getName() + " " + e.getSalary());
    }

    private String name;
    private double salary;
    private int id;
    private static int nextId = 1;
}