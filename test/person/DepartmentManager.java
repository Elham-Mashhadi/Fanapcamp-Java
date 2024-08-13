package test.person;

public class DepartmentManager extends Employee{

    public void calculateSalary(){
        System.out.println("Salary");
    }
    public void calculateFee(){
        System.out.println("Fee");
    }

    public DepartmentManager(String firstName, String lastName, String nationalCode, Gender gender, ContractType contractType, int salary) {
        super(firstName, lastName, nationalCode, gender, contractType, salary);
    }
}
