package ru.skypro;

public class Main {

    public static void main(String[] args) {
    Employee[] employees = new Employee[5]; {
            new Employee("Олег Олегович Олегов", 1, 20000);
            new Employee("Анна Олеговна Пуп", 2, 30000);
            new Employee("Сергей Серегеевич Сергеев", 3, 25000);
            new Employee("Артем Артемович Артемов", 4, 35000);
            new Employee("Игорь Игоревич Игорев", 5, 50000);
            new Employee("Антон Анотнович Антонов", 5, 150000);
            new Employee("Степан Степанович Степанов", 4, 250000);
            new Employee("Виктор Викторович Викторов", 3, 750000);
            new Employee("Андрей Андреевич Андреев", 2, 310000);
            new Employee("Семен Семенович Семенов", 1, 1000);
      }
        Employee.printListEmployees(employees);
        Employee.printSumSalary(employees);
        Employee.printMinSalary(employees);
        Employee.printMaxSalary(employees);
        Employee.printAverageSalary(employees);
        Employee.printEmployeeName(employees);
    }

}
