public class Employee {
    private String name;
    private Department department;
    public Employee(String name) {
        this.name=name;
    }
    public String getName() { return name; }
    public Department getDepartment() { return department; }
    public void setDepartment(Department department) {
        if (this.department!=null) {
            this.department.getEmployees().remove(this);
        }
        this.department=department;
        if (department!=null) {
            department.addEmployee(this);
        }
    }
    @Override
    public String toString() {
        if (department==null) return name;
        if (this==department.getChief()) {
            return name+" начальник отдела "+department.getName();
        }
        Employee chief=department.getChief();
        String chiefName=(chief!=null) ? chief.getName() : "не назначен";
        return name+" работает в отделе "+department.getName()+", начальник которого "+chiefName;
    }
}
