package ContactsClasses;
import java.io.IOException;
import java.util.Scanner;

public class util extends DefaultContacts{

    public static void main(String[] args) throws IOException {
    optionTwo();

    }
    private static Scanner input = new Scanner(System.in);

    //Option Choosing
    public static int optionEval(){
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):\n");
        int result = input.nextInt();
        if (result > 0 && result < 6){
//            System.out.println(result);
            return result;
        }else if(result == 9){
            return result;
        }
        System.out.println("That is not a valid choice... try again");
        return optionEval();
    };



    //View all

    public static void optionOne() throws IOException {
        System.out.println(reader());
    }

    //Adding give name/number

    public static void optionTwo() throws IOException {
        System.out.println("Give me a name");
        String name = input.nextLine();
        if(!name.matches("[a-zA-Z]+\s[a-zA-Z]+")){
            System.out.println("Thats not a name!... Format ex: John Doe");
            optionTwo();
        }
        System.out.println("Give me a number");
        int number = input.nextInt();

    }



    //Removing by name

    //Searching

    //Exit


}
