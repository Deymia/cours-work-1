import java.util.Arrays;

public class Main {

    public static void countSalary(Employee[] arr) {
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            float salary = arr[i].getSalary();
            sum = sum + salary;
        }
        System.out.println("Сумма средст на зарплату: " + sum);
    }

    public static void findMaxSalary (Employee[] arr){

        float maxSalary = 0;
        for (int i = 0; i < arr.length; i++){
            if (maxSalary < arr [i].getSalary()) {
                maxSalary = arr[i].getSalary();
            }
        } System.out.println("Максимальная зарплата: " + maxSalary);
    }

    public static void findMinSalary (Employee[] arr){

        float minSalary = arr[0].getSalary();
        for (int i = 0; i < arr.length; i++){
            if (minSalary > arr[i].getSalary()){
                minSalary = arr[i].getSalary();
            }
        }
        System.out.println("Минимальная зарплата: " + minSalary);
    }

    public static void findAverageSalary (Employee[] arr){

        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            float salary = arr[i].getSalary();
            sum = sum + salary;
        }
        float averageSalary = sum/ arr.length;
        System.out.println("Средняя зарплата: "+ averageSalary);
    }

    public static void makeListEmployees (Employee[] arr){

        String listEmployees = new String();
        for (int i = 0; i < arr.length; i++){
            listEmployees = arr[i].getEmployeeName();
            System.out.println("Сотрудник: " + listEmployees);
        }
    }


    public static void main(String[] args) {

        Employee [] employees = new Employee[10];
            employees[0] = new Employee("Иванов Сергей Сергеевич", 1, 120_000);
            employees[1] = new Employee("Петров Иван Иванович", 2, 105_000);
            employees[2] = new Employee("Кузнецова Мария Ивановна", 2, 110_000);
            employees[3] = new Employee("Семенова Ирина Владимировна", 3, 61_000);
            employees[4] = new Employee("Круглов Петр Петрович", 4, 54_000);
            employees[5] = new Employee("Сергеева Анна Ивановна", 5, 132_000);
            employees[6] = new Employee("Лукичев Олег Сергеевич", 4, 124_000);
            employees[7] = new Employee("Радионов Семен Васильевич", 1,45_000);
            employees[8] = new Employee("Павлова Марина Анатольевна", 3, 150_000);
            employees[9] = new Employee("Алексеева Маргарита Влладимировна", 4, 44_000);


        System.out.println("Количество сотрудников: " + Employee.getCounter());
        System.out.println(Arrays.toString(employees));
        Main.countSalary(employees);
        Main.findMaxSalary(employees);
        Main.findMinSalary(employees);
        Main.findAverageSalary(employees);
        Main.makeListEmployees(employees);

    }
}