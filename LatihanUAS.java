import java.util.Scanner;

    public static void main(String[] args){
        System.out.println("Enter employee information:");

        Scanner input = new Scanner(System.in);

        System.out.println("Employee name:");
        String name = input.nextLine();

        System.out.println("Job title:");
        String jobTitle = input.nextLine();

        System.out.println("Salary:");
        int salary = input.nextInt();

        System.out.println();

        employee Employee = new employee(name, jobTitle, salary);

        System.out.println("Employee information:");
        System.out.printf("Name     : %s%n", Employee.getName());
        System.out.printf("Job title: %s%n", Employee.getJob());
        System.out.printf("Salary   : %d%n", Employee.getSalary());
}