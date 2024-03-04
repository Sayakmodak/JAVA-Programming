class Employee{     // --> class
    int id;            // --> attributes
    String name;        // --> attributes
    int age;
    public void printDetails(){                     // --> methods
        System.out.println("Id is " + id);
        System.out.println("Name is " + name);
    }
    public int getAge(){                            // --> methods too
        return age;
    }
}
public class custom_class{
    public static void main(String [] args){
        Employee emp1 = new Employee();
        emp1.id = 10;
        emp1.name = "Rohit";
        emp1.age = 20;
        emp1.printDetails();
        System.out.println("Age is " + emp1.getAge());

        Employee emp2 = new Employee();
        emp2.id = 11;
        emp2.name = "Rakhab";
        emp2.age = 20;
        emp2.printDetails();
        System.out.println("Age is " + emp2.getAge());
    }   
}