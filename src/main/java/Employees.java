import java.util.ArrayList;
import java.util.List;


public class Employees {

    //Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников
    private List<Employee> employeeList = new ArrayList<>();

    //Добавить метод, который ищет сотрудника по стажу (может быть список)
    public List<Employee> findByExperience(int experience) {
        List<Employee> employeeBuffer = new ArrayList<>();
        for (Employee buf : employeeList) {
            if (buf.getExperience() == experience) {
                employeeBuffer.add(buf);
            }
        }
        return employeeBuffer;
    }

    // Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
    public List<String> findByFCs(String FCs) {
        List<String> employeeBuffer = new ArrayList<>();
        for (Employee buf : employeeList) {
            if (buf.getFCs().equals(FCs)) {
                employeeBuffer.add(buf.getPhoneNumber());
            }
        }
        return employeeBuffer;
    }

    // Добавить метод, который ищет сотрудника по табельному номеру
    public List<Employee> findByServiceNumber(String serviceNumber) {
        List<Employee> employeeBuffer = new ArrayList<>();
        for (Employee buf : employeeList) {
            if (buf.getServiceNumber().equals(serviceNumber)) {
                employeeBuffer.add(buf);
            }
        }
        return employeeBuffer;
    }

    // Добавить метод добавление нового сотрудника в справочник
    public void addNewEmployee(Employee employee) {
        employeeList.add(employee);
        System.out.println("Сотрудник успешно добавлен");
    }
}
