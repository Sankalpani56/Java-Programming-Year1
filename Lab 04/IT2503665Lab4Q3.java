import java.util.Scanner;
public class IT2503665Lab4Q3 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = input.nextInt();

        String result = (num<0)? " Negative " : (num>0)? " Positive " : " Zero ";

        System.out.println(" The number is : " +  result);
    }
}