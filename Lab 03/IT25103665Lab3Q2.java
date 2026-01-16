import java.util.Scanner;
public class IT25103665Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly Salary :");
        double salary = input.nextDouble();

        System.out.print("Enter the number of OT hours : ");
        int otHours = input.nextInt();

        System.out.print("Enter the OT hourly rte : ");
        int othourlyRate = input.nextInt();

        double otAmount= otHours*othourlyRate;
        double totalSalary  = salary + otAmount;

        System.out.println("The total salaryincluding OT is : " + totalSalary);

    }
}