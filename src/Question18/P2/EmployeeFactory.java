package Question18.P2;

@FunctionalInterface
public interface EmployeeFactory {
    Employee getEmployee(String name, Integer age, String city);
}
