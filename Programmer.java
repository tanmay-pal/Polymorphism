public class Programmer extends Employee{
    int teams;    
    public Programmer(int empId, String empName, String role, int teams) {
        super(empId, empName, role);
        this.teams = teams;
    }
    @Override
    public String toString() {
        return "Programmer Details :: " +
            "\n Emp ID - " +super.getEmpId() +
            "\n Employee Name - "+ super.getEmpName() +
            "\n Role of Employee is - "+super.getRole() +
            "\n Working with no of teams - "+ teams;
    }
}

