public class Employee {
    private int empId;
    private String empName;
    private String role;
    
    public Employee() {}    
    public Employee(int empId, String empName, String role) {
        this.empId = empId;
        this.empName = empName;
        this.role = role;
    }
    public int getEmpId() {
        return this.empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }

public String getEmpName() {
        return this.empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public String getRole() {
        return this.role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String toString() {
        return null;
    }
}