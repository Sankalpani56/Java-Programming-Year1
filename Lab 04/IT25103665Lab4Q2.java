
import java.util.Scanner;
public class IT25103665Lab4Q2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exam marks(given out of 100 ) : ");
        int examMark =  input.nextInt();

        if(examMark<0 || examMark>100){
            System.out.println("Invalid input for exam marks. Terminating program ");
            return;
        }

        System.out.print("Enter the Lab submission marks(given out of 100 ) : ");
        int labMark =  input.nextInt();

        if(labMark<0 || labMark>100){
            System.out.println("Invalid input for exam marks. Terminating program ");
            return;
        }

        System.out.print("Enter the percentage given for the exam : ");
        int examPercentage =  input.nextInt();

        System.out.print("Enter the percentage given for the Lab submission : ");
        int labPercentage =  input.nextInt();

        if(examPercentage + labPercentage != 100){
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMark = (examMark*examPercentage/100) +(labMark*labPercentage/100);

        System.out.println("Final exam Mark is : " + finalMark);

       

    }
}