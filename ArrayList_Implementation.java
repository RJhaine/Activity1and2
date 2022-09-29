import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayList_Implementation {

   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character choice, clear;

      List<Integer> arraylist = new ArrayList<Integer>();

      while (true) {
         System.out.println("");
         System.out.println("Choose letters for operation:");
         System.out.println("");
         System.out.println("A. Add numbers:");
         System.out.println("B. Remove numbers:");
         System.out.println("C. Display numbers:");
         System.out.println("D. Clear numbers:");
         System.out.println("E. Exit");
         System.out.println("");
         System.out.println("Choice:");
         choice = input.next().charAt(0);
         System.out.println("");

         switch (choice) {
            case 'A':
               System.out.println("Add your chosen numbers:");
               int sum = input.nextInt();
               System.out.println("");

               if (sum > 0) {
                  arraylist.add(sum);

                  System.out.println( sum + ":This number is already added to arraylist!");
                  System.out.println("************************************************");
                  break;

               }

               else {
                  System.out.println("Invalid!");
                  break;
               }

            case 'B':
               System.out.println("Enter number you want to remove:");
               int remove = input.nextInt();
               System.out.println("");

               if (arraylist.contains(remove)) {
                  arraylist.remove(Integer.valueOf(remove));
                  System.out.println(remove + ":This number is already removed!");
                  break;
               }
            case 'C':
               System.out.println("Displaying Arraylist:");
               for (Integer number : arraylist) {
                  System.out.println(number);
               }
               break;

            case 'D':
               System.out.println("Do you want to clear this?(y/n):");
               clear = input.next().charAt(0);
               switch (clear) {
                  case 'y':
                     System.out.println("Clear!!!");
                     arraylist.clear();
                     System.out.println("");
                     System.out.println("All cleared!");
                     System.out.println("");
                     break;

                  case 'n':
                     System.out.println("ArrayList not cleared!");
                     break;
               }
               break;

            case 'E':
               input.close();
               System.exit(0);

            default:
               System.out.println("Invalid! Input the right choice!");
         }

      }

   }
}
