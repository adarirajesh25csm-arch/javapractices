class Employee {
    String name;
    int id;
    String designation;
    double salary;
    String promotionStatus;

    // Constructor 1
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.designation = "Trainee";
        this.salary = 20000;
        this.promotionStatus = "Not Promoted";
    }

    // Constructor 2
    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = 30000;
        this.promotionStatus = "Not Promoted";
    }

    // Constructor 3
    Employee(String name, int id, String designation,
             double salary, String promotionStatus) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        this.salary = salary;
        this.promotionStatus = promotionStatus;
    }

    void display() {
        System.out.println("Name            : " + name);
        System.out.println("ID              : " + id);
        System.out.println("Designation     : " + designation);
        System.out.println("Salary          : " + salary);
        System.out.println("Promotion Status: " + promotionStatus);
        System.out.println();
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {

        Employee e1 = new Employee("Ravi", 101);

        Employee e2 = new Employee("Sita", 102, "Manager");

        Employee e3 = new Employee(
                "Kiran", 103, "Team Lead",
                60000, "Promoted"
        );

        System.out.println("Employee 1 Details");
        e1.display();

        System.out.println("Employee 2 Details");
        e2.display();

        System.out.println("Employee 3 Details");
        e3.display();
    }
}
