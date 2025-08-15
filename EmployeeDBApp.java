
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class EmployeeDBApp {

    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);
            
        // try {
        //     if (DBConnection.getConnection() != null) {
        //         System.out.println("connection successful");
        //     } else {
        //         System.out.println("connection error");
        //     }
        // } catch (SQLException e) {
        //     System.out.println("connection error: " + e.getMessage());
        // }
        
        while (true) {
            System.out.println("\n=== Employee Database Menu ===\n1. Add Employee\n2. View Employees\n3. Update Employee\n4. Delete Employee\n5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (choice) {
                    case 1 -> {
                        System.out.print("Enter name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter role: ");
                        String role = sc.nextLine();
                        System.out.print("Enter salary: ");
                        double salary = sc.nextDouble();
                        dao.addEmployee(new Employee(name, role, salary));
                        System.out.println("Employee added!");
                    }
                    case 2 -> {
                        List<Employee> list = dao.getAllEmployees();
                        if (list.isEmpty()) {
                            System.out.println("No employees found.");
                        } else {
                            list.forEach(System.out::println);
                        }
                    }
                    case 3 -> {
                        System.out.print("Enter employee ID to update: ");
                        int id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new role: ");
                        String role = sc.nextLine();
                        System.out.print("Enter new salary: ");
                        double salary = sc.nextDouble();
                        dao.updateEmployee(id, role, salary);
                        System.out.println("Employee updated!");
                    }
                    case 4 -> {
                        System.out.print("Enter employee ID to delete: ");
                        int id = sc.nextInt();
                        dao.deleteEmployee(id);
                        System.out.println("Employee deleted!");
                    }
                    case 5 -> {
                        System.out.println("Exiting...");
                        sc.close();
                        return;
                    }
                    default ->
                        System.out.println("Invalid choice!");
                }
            } catch (SQLException e) {
                System.out.println("Database error: " + e.getMessage());
            }
        }
    }
}
