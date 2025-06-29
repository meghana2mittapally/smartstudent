import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {
            System.out.println("\n===== SmartStudent Menu =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Delete Student by Roll No");
            System.out.println("4. Update Student by Roll No");
            System.out.println("5. Search Student by Roll No");
            System.out.println("6. Search Students by Department");
            System.out.println("7. Search Students by Marks Range");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                System.out.print("Enter roll number: ");
                String rollNo = scanner.nextLine();
                System.out.print("Enter department: ");
                String dept = scanner.nextLine();
                System.out.print("Enter email: ");
                String email = scanner.nextLine();
                System.out.print("Enter phone: ");
                String phone = scanner.nextLine();
                System.out.print("Enter marks: ");
                int marks = Integer.parseInt(scanner.nextLine());

                Student s = new Student();
                s.setName(name);
                s.setRollNo(rollNo);
                s.setDepartment(dept);
                s.setEmail(email);
                s.setPhone(phone);
                s.setMarks(marks);

                dao.addStudent(s);
            }
            else if (choice == 2) {
                List<Student> all = dao.getAllStudents();
                System.out.println("\nAll Students:");
                for (Student s : all) {
                    System.out.println(
                        s.getId() + " | " +
                        s.getName() + " | " +
                        s.getRollNo() + " | " +
                        s.getDepartment() + " | " +
                        s.getEmail() + " | " +
                        s.getPhone() + " | " +
                        s.getMarks()
                    );
                }
            }
            else if (choice == 3) {
                System.out.print("Enter roll number to delete: ");
                String rollNo = scanner.nextLine();
                dao.deleteStudentByRollNo(rollNo);
            }
            else if (choice == 4) {
                System.out.print("Enter roll number to update: ");
                String rollNo = scanner.nextLine();
                System.out.print("Enter new name: ");
                String newName = scanner.nextLine();
                System.out.print("Enter new department: ");
                String newDept = scanner.nextLine();
                System.out.print("Enter new email: ");
                String newEmail = scanner.nextLine();
                System.out.print("Enter new phone: ");
                String newPhone = scanner.nextLine();
                System.out.print("Enter new marks: ");
                int newMarks = Integer.parseInt(scanner.nextLine());

                dao.updateStudentByRollNo(rollNo, newName, newDept, newEmail, newPhone, newMarks);
            }
            else if (choice == 5) {
                System.out.print("Enter roll number to search: ");
                String rollNo = scanner.nextLine();
                Student s = dao.getStudentByRollNo(rollNo);
                if (s != null) {
                    System.out.println(
                        s.getId() + " | " +
                        s.getName() + " | " +
                        s.getRollNo() + " | " +
                        s.getDepartment() + " | " +
                        s.getEmail() + " | " +
                        s.getPhone() + " | " +
                        s.getMarks()
                    );
                } else {
                    System.out.println("⚠ No student found with roll number: " + rollNo);
                }
            }
            else if (choice == 6) {
                System.out.print("Enter department to search: ");
                String dept = scanner.nextLine();
                List<Student> list = dao.getStudentsByDepartment(dept);
                if (!list.isEmpty()) {
                    for (Student s : list) {
                        System.out.println(
                            s.getId() + " | " +
                            s.getName() + " | " +
                            s.getRollNo() + " | " +
                            s.getDepartment() + " | " +
                            s.getEmail() + " | " +
                            s.getPhone() + " | " +
                            s.getMarks()
                        );
                    }
                } else {
                    System.out.println("⚠ No students found in department: " + dept);
                }
            }
            else if (choice == 7) {
                System.out.print("Enter minimum marks: ");
                int min = Integer.parseInt(scanner.nextLine());
                System.out.print("Enter maximum marks: ");
                int max = Integer.parseInt(scanner.nextLine());
                List<Student> list = dao.getStudentsByMarksRange(min, max);
                if (!list.isEmpty()) {
                    for (Student s : list) {
                        System.out.println(
                            s.getId() + " | " +
                            s.getName() + " | " +
                            s.getRollNo() + " | " +
                            s.getDepartment() + " | " +
                            s.getEmail() + " | " +
                            s.getPhone() + " | " +
                            s.getMarks()
                        );
                    }
                } else {
                    System.out.println("⚠ No students found in that marks range.");
                }
            }
            else if (choice == 8) {
                System.out.println("Goodbye!");
                break;
            }
            else {
                System.out.println("Invalid choice. Try again!");
            }
        }
        scanner.close();
    }
}
