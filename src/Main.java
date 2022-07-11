import java.util.Arrays;

public class Main {

/*    public static float countSalary (float salary){

        float sum = 0;
        for (int i = 0; i < )
        sum = sum + salary;

        return sum;
    }*/
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

    }
}