import java.util.Scanner;
    public class IT25103665Lab3Q1A {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the price of 1kg of rice : ");
            double price1KG = input.nextDouble();

            System.out.print("Enter the number of kilograms you want to buy : ");
            int numberOfkilos = input.nextInt();

            double totalAmount = price1KG*numberOfkilos;

            System.out.println(" ");
            System.out.println("The total Amount is : " + totalAmount);
        }
    }