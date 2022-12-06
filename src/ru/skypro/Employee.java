package ru.skypro;

public class Employee {
    private String name;
    private int department;
    private int salary;
    private static int counter;
    private int id = counter++;

    public String getName() {
        return name;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    public static void printListEmployees(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees.toString());
        }
    }

    public static int sumSalary(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return sum;
    }

    public static void printSumSalary(Employee[] employees) {
        System.out.println(sumSalary(employees));
    }


    public static int minSalary(Employee[] employees) {
        int count = 0;
        for (; count < employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        int min = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            if (min > employees[count].getSalary()) {
                min = employees[count].getSalary();
            }
        }
        return min;
    }

    public static void printMinSalary(Employee[] employees) {
        System.out.println(minSalary(employees));
    }

    public static int maxSalary(Employee[] employees) {
        int count = 0;
        for (; count < employees.length; ) {
            if (employees[count] != null) {
                break;
            }
            count++;
        }
        int max = employees[count].getSalary();
        for (count++; count < employees.length; count++) {
            if (max < employees[count].getSalary()) {
                max = employees[count].getSalary();
            }
        }
        return max;
    }

    public static void printMaxSalary(Employee[] employees) {
        System.out.println(maxSalary(employees));

    }

    public static int averageSalary(Employee[] employees) {
        int average = sumSalary(employees) / employees.length;
        return average;
    }

    public static void printAverageSalary(Employee[] employees) {
        System.out.println(averageSalary(employees));
    }

    public static void printEmployeeName(Employee[] employees){
        for (Employee employee: employees){
            if (employee != null && employee.name == employee.getName()){
                System.out.println(employee.toString());
            }
        }
    }
}





