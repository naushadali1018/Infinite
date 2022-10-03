class employee {
    private int EmployeeId;
    private String EmployeeName;
    private int age;
    private String Address;
    private String Department;

    public employee() {
    }

    public int getEmployeeId() {
        return EmployeeId;
    }

    public void setEmployeeId(int employeeId) {
        EmployeeId = employeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String employeeName) {
        EmployeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public employee(int employeeId, String employeeName, int age, String address, String department) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
        this.age = age;
        Address = address;
        Department = department;
    }

    @Override
    public String toString() {
        return "employee{" +
                "EmployeeId=" + EmployeeId +
                ", EmployeeName='" + EmployeeName + '\'' +
                ", age=" + age +
                ", Address='" + Address + '\'' +
                ", Department='" + Department + '\'' +
                '}';
    }
}
class Department{
    private int DepartmentId;
    private String DepartmentName;

    public Department(int departmentId, String departmentName) {
        DepartmentId = departmentId;
        DepartmentName = departmentName;
    }

    public Department() {
    }

    public int getDepartmentId() {
        return DepartmentId;
    }

    public void setDepartmentId(int departmentId) {
        DepartmentId = departmentId;
    }

    public String getDepartmentName() {
        return DepartmentName;
    }

    public void setDepartmentName(String departmentName) {
        DepartmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "DepartmentId=" + DepartmentId +
                ", DepartmentName='" + DepartmentName + '\'' +
                '}';
    }
}

public class EmployeeDetails{
    public static  void main(String[] args){
    employee emp=new employee();
    Department dep=new Department();

    emp.setEmployeeName("Naushad ali");
    emp.setEmployeeId(1);
    emp.setAddress("Banglore");
    emp.setAge(22);
    emp.setDepartment("Software Developer");
    dep.setDepartmentId(1);
    dep.setDepartmentName("Software developer");
    System.out.println(emp.toString()+ dep.toString());

    }
}
