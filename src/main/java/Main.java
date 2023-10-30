//Создать справочник сотрудников
//        Необходимо:
//        Создать класс справочник сотрудников, который содержит внутри коллекцию
//        сотрудников - каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
//        Добавить метод, который ищет сотрудника по стажу (может быть список)
//        Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
//        Добавить метод, который ищет сотрудника по табельному номеру
//        Добавить метод добавление нового сотрудника в справочник
public class Main {
    public static void main(String[] args) {
        Employees employees = new Employees();

        employees.addNewEmployee(new Employee("111", "121-121",
                "Петр Петрович Сидоров", 3));
        employees.addNewEmployee(new Employee("112", "122-122",
                "Александр Игоревич Петько", 2));
        employees.addNewEmployee(new Employee("113", "123-123",
                "Валерий Георгиевич Летин", 1));

        System.out.println(employees.findByFCs("Валерий Георгиевич Летин"));
        System.out.println(employees.findByExperience(2));
        System.out.println(employees.findByServiceNumber("111"));
    }
}
