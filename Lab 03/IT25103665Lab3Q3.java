import java.util.Scanner;
public class IT25103665Lab3Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Rupee amount : ");
        int amount = input.nextInt();
        
        int notes[] = {5000,1000,500,200,100,50,20,10,5,2,1};

        for(int note : notes){

            int count = amount/note;
            amount = amount%note;
                 System.out.println(note + " Notes - " + count);
            
        }
    }
}