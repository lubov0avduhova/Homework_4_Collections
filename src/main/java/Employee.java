//каждый сотрудник должен иметь следующие атрибуты:
//        Табельный номер
//        Номер телефона
//        Имя
//        Стаж
public class Employee {
    private String serviceNumber;
    private String phoneNumber;
    private String FCs;
    private int experience;


    public Employee(String serviceNumber, String phoneNumber, String FCs, int experience) {
        this.serviceNumber = serviceNumber;
        this.phoneNumber = phoneNumber;
        this.FCs = FCs;
        this.experience = experience;
    }

    public String getServiceNumber() {
        return serviceNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFCs() {
        return FCs;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "serviceNumber='" + serviceNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", FCs='" + FCs + '\'' +
                ", experience=" + experience +
                '}';
    }
}
