import java.util.Scanner;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class jane{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<String> Information = new ArrayList<String>();
        Set<String> Data = new HashSet<String>();

        System.out.print("Input your name: ");
        String name = input.nextLine();

        System.out.print("What is your favorite color? ");
        String color = input.nextLine();
        Information.add(color);
        Data.add(color);

        System.out.print("What is your hobby? ");
        String hobby = input.nextLine();
        Information.add(hobby);
        Data.add(hobby);

        System.out.print("What is your age? ");
        String age = input.nextLine();
        Information.add(age);
        Data.add(age);

        System.out.print("What is your favorite song? ");
        String sport = input.nextLine();
        Information.add(sport);
        Data.add(sport);

        System.out.print("When is your birthday?");
        String birthday = input.nextLine();
        Information.add(birthday);
        Data.add(birthday);
        
        System.out.println("HASHSET DISPLAY");
        System.out.println(name + "'s Personal Information: ");

        Iterator<String> iterator_hashset = Data.iterator();
        while(iterator_hashset.hasNext()){
            System.out.println(iterator_hashset.next());
        } 

        input.close();

    }
}