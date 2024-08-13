package test.person;

public class Manager extends Employee{
    public void order(){
        System.out.println("order");
    }

    public Manager(String firstName, String lastName, String nationalCode, Gender gender, ContractType contractType, int salary) {
        super(firstName, lastName, nationalCode, gender, contractType, salary);
    }
}
