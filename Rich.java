
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class Rich{




    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);




        List<String> Information = new ArrayList<String>();




        System.out.print("Input your name: ");

        String name = input.nextLine();




        System.out.print("What is your favorite color? ");

        String color = input.nextLine();

        Information.add(color);




        System.out.print("What is your hobby? ");

        String hobby = input.nextLine();

        Information.add(hobby);




        System.out.print("What is your age? ");

        String age = input.nextLine();

        Information.add(age);




        System.out.print("What is your favorite song? ");

        String sport = input.nextLine();

        Information.add(sport);




        System.out.print("When is your birthday?");

        String birthday = input.nextLine();

        Information.add(birthday);

        

        System.out.println("ARRAYLIST DISPLAY");

        System.out.println(name + "'s Personal Information: ");




        Iterator<String> iterator_arraylist = Information.iterator();

        while(iterator_arraylist.hasNext()){

            System.out.println(iterator_arraylist.next());

        } 


        input.close();




    }

}