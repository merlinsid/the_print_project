public class Mookaters {
  private int employeeId;
  private String name;
  private long salary;

  public Mookaters(int employeeId, String name, long salary) {
    this.employeeId = employeeId;
    this.name = name;
    this.salary = salary;
  }

  public int getEmployeeId() {
    return employeeId;
  }

  public String getName() {
    return name;
  }

  public long getSalary() {
    return salary;
  }

public void print(){
  System.out.println("Name" + getName());
  System.out.println("EmployeeId" + getEmployeeId());
  System.out.println("Salary" + getSalary());
}

}
