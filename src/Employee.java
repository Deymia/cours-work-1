public class Employee {
    private String employeeName;
    private int department;
    private float salary;
    private static int counter = 1;
    private int id;


    public Employee(String employeeName, int department, float salary) {
        this.employeeName = employeeName;
        this.department = department;
        this.salary = salary;
        this.id = getCounter();
        counter++;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id+ " ФИО сотрудника: " + this.employeeName + "\n Номер отдела: " + this.department + "\n Заработная плата: " + this.salary + "\n";
    }

    public static int getCounter() {
        return counter;
    }
/*
    public static float countSalary(float salary){
        float sum = 0;
        sum = sum+ salary;
        return sum;
    }*/



}