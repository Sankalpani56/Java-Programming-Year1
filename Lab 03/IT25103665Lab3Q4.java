import java.util.Scanner;
public class IT25103665Lab3Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a five-digit number : ");
        int num = input.nextInt();

        int n1 = num/10000;
        int n2 = (num/1000)%10;
        int n3 = (num/100)%10;
        int n4 = (num/10)%10;
        int n5 = num%10;

        System.out.println(n1+ " " + n2+ " "+n3+ " "+n4+ " "+n5 );
    }
}