public class Employee extends Manager{

    public static void main(String args[]){
    
    
    Employee emp=new Employee();
    emp.salary=1000;
    System.out.println("Salary of Employee is"+emp.salary);


    Manager man=new Manager();
    man.salary=2000;
    System.out.println("MAnager Salary is "+man.salary);

    }
}
