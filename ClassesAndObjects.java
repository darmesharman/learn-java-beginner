public class ClassesAndObjects {
    public static void main(String[] args) {
        Employee.job = "Sber Bank";
        Employee e1 = new Employee("Bob", 40000);
        Employee e2 = new Employee("Tom", 30000);
        Employee e3 = new Employee("Jack", 30000);

        e1.info();
        e2.info();
        e3.info();
        Employee.getNumberOfEmployees();

        Employee.job = "Bereke Bank";

        e1.info();
        e2.info();
        e3.info();
        Employee.getNumberOfEmployees();
    }
}

class Employee {
    private String name;
    private int salary;

    public static int count = 0;
    public static String job;

    public Employee(String name, int salary) {
        this.setName(name);
        this.setSalary(salary);
        count++;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return this.salary;
    }

    public void info() {
        System.out.println(this.name + " works at " + job + " for salary " + this.salary);
    }

    public static int getNumberOfEmployees() {
        return count;
    }
}
