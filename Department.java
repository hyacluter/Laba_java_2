import java.util.ArrayList;
import java.util.List;
public class Department {
    private String name;
    private Employee chief;
    private List<Employee> employees=new ArrayList<>();
    public Department(String name){
        this.name=name;
    }
    public String getName() { return name; }
    public Employee getChief() { return chief; }
    public void setChief(Employee chief) { this.chief=chief; }
    public List<Employee> getEmployees() { return employees; }
    public void addEmployee(Employee e) {
        if (!employees.contains(e)) employees.add(e);
    }
    @Override
    public String toString() {
        return "Отдел "+name;
    }
}
