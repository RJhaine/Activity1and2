import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Implementation {

   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character Choice, clear;

      Set<Integer> hashset = new HashSet<Integer>();

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
         Choice = input.next().charAt(0);
         System.out.println("");

         switch (Choice) {
            case 'A':
               System.out.println("Add your chosen numbers:");
               int add = input.nextInt();
               System.out.println("");

               if (hashset.contains(add)){
                System.out.println("Value already exists! Not added!");

               }

               else {
                hashset.add(add);
                System.out.println( add + ":This number is already added!");
               }
               break;

            case 'B':
               System.out.println("Enter the number you want to remove:");
               int remove = input.nextInt();
               System.out.println("");

               if (hashset.contains(remove)) {
                  hashset.remove(Integer.valueOf(remove));
                  System.out.println( remove + ":This number is already removed!");
                  break;
               }
               break;

            case 'C':
               System.out.println("Displaying HashSet:");
               System.out.println("============================");
             
               Iterator<Integer> it_set = hashset.iterator();
               while(it_set.hasNext()){
                    System.out.println(it_set.next());
               }

               System.out.println("=======================");
               break;

            case 'D':
               System.out.println("Do you want to clear this?(y/n):");
               clear = input.next().charAt(0);
               switch (clear) {
                  case 'y':
                     System.out.println("Clear!!!");
                     hashset.clear();
                     System.out.println("");
                     System.out.println("-------------------");
                     System.out.println("All cleared!");
                     System.out.println("");
                     break;

                  case 'n':
                     System.out.println("HashSet not cleared!");
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
