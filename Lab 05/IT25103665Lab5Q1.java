import java.util.Scanner;
public class IT25103665Lab5Q1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first integer : ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second integer : ");
        int num2 = input.nextInt();

        System.out.print("Enter the Third integer : ");
        int num3 = input.nextInt();

        int max = num1;
        if(max< num2){
            max = num2;
        }
        if(max<num3){
            max = num3;
        }

        int min = num1;
        if(min>num2){
            min = num2;
        }if(min>num3){
            min = num3;

        }
        System.out.println(" ");
        System.out.println("User entered numbers are : " + num1 + " " + num2 + " " + num3);
        System.out.println("The Smallest number is : " + min);
        System.out.println("The Largest  number is : " + max);
    }
}