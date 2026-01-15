import java.util.Scanner;
    public class IT25103665Lab3Q1B {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the price of 1kg of rice : ");
            double price1KG = input.nextDouble();

            System.out.print("Enter the number of kilograms you want to buy : ");
            int numberOfkilos = input.nextInt();

            double totalAmount = price1KG*numberOfkilos;
            double discount  = totalAmount*0.1;
             double finalAmount = totalAmount-discount;

            System.out.println(" ");
            System.out.println("The total Amount is : " + finalAmount);
        }
    }