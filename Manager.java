public class Manager extends Employee{
    int teams;
    public Manager(int empId, String empName, String role, int teams) {
        super(empId, empName, role);
        this.teams = teams;
    }
    @Override
    public String toString() {
        return "Manager Details :: " +
            "\n Emp ID - " +super.getEmpId() +
            "\n Employee Name - "+ super.getEmpName() +
            "\n Role of Employee is - "+super.getRole()+
            "\n Working with no of teams - "+ teams;
    }
}

