import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class HashMap_Implementation {

   public static void main(String args[]) {

      Scanner input = new Scanner(System.in);

      Character choice, clear;

      Map<Integer , Integer> hashmap = new HashMap<Integer , Integer>();

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
               System.out.println("Only composite numbers:");
               System.out.println("Enter number:");
               int add = input.nextInt();
               System.out.println("");

               int j = add/2;
               int isPrime = 0;

               if (add == 0 || add == 1){
                System.out.println("Enter key number you want to add:");
                int key = input.nextInt();
                System.out.println("");

                hashmap.put(key, add);
                System.out.println(key + "=>" + add + "Successfully added to HashMap");
                           
            }
               

               else {
                for (int i = 2; i <= j; i++)
                {
                    if(add%i == 0){
                        System.out.println("Enter key number you want to add:");
                        int key = input.nextInt();
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println(key + "=>" + add + "Successfully added to HashMap");
                        isPrime = 1;
                        break;
                    }
                }
                  if (isPrime == 0)
                  {
                    System.out.println("Integer is a prime number. It is not added in the HashMap.");
                  }
               }

               break;
            case 'B':
               System.out.println("Enter number you want to remove:");
               int remove = input.nextInt();
               System.out.println("");

               if (hashmap.containsKey(remove)) {
                  System.out.println(remove +"=>" + hashmap.get(remove) + "Successfully removed!");
                  hashmap.remove(remove);
                
               }
               break;
               
               
            case 'C':
               System.out.println("Displaying Arraylist:");
               System.out.println("============================");
               
               hashmap.entrySet().forEach(entry -> {
                System.out.println(entry.getKey() + "=>" + entry.getValue());
               });

               System.out.println("=======================");

               break;

            case 'D':
               System.out.println("Do you want to clear this?(yes/no):");
               clear = input.next().charAt(0);
               switch (clear) {
                  case 'y':
                     System.out.println("Clear!!!");
                     hashmap.clear();
                     System.out.println("");
                     System.out.println("-------------------");
                     System.out.println("All cleared!");
                     System.out.println("");
                     break;

                  case 'n':
                     System.out.println("HashMap not cleared!");
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
