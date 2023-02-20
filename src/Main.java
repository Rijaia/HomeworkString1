public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа по строкам. Часть 1");
        System.out.println("Задача 1");
        String firstName = "Семён ";
        String middleName = "Семёнович ";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println("ФИО сотрудника - "+ fullName);

        System.out.println("Задача 2");
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Задача 3");
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника - " +fullName);

    }
}