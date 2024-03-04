class Employee{
    int id;
    int salary;
    String name;

    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public void setName(String n){
        name = n;
    }
}
public class ps_1 {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Raju" ;
        emp1.salary = 10 ;
        System.out.println("Name is " + emp1.getName());
        System.out.println("Salary is " + emp1.getSalary());
        emp1.setName("Rohan"); 
        System.out.println("Name changed " + emp1.name);
    }
}