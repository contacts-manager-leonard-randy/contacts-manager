package ContactsClasses;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class util extends DefaultContacts{

    private static final Scanner input = new Scanner(System.in);

    //User's Option
    public static int optionEval(){
        System.out.println("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5):\n");
        String response = input.nextLine();
        int result;
        try {
            result = Integer.parseInt(response);
            if ((result > 0 && result < 6) || result == 9) return result;
        } catch(Exception e) {
            System.out.println("That is not a valid choice... try again");
            return optionEval();
        }
        return result;
    };

    //View all
    public static void allGuys() throws IOException {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n  Name                 | Phone Number \n-----------------------------------");
        for (String contact : contacts) {
            System.out.printf("%35s%n",contact);
        }
        writer(contacts);
    }
    //Adding give name/number
    public static void newGuy() throws IOException {
        allGuys();
        System.out.println("Give me a name");
        String result = newName() + " | " + newNum();
        addContacts(result);
        allGuys();
    }
    private static String newName(){
        String name = input.nextLine();
        if(!name.matches("[a-zA-Z]+\s[a-zA-Z]+")){
            System.out.println("Thats not a name!... Format ex: John Doe");
            return newName();
        }
        return name;
    }
    private static String newNum(){
        System.out.println("Give me a number");
        String number = input.nextLine();
        if(number.length() == 10 && number.matches("[0-9]+")) return number;
        System.out.println("That is not a valid phone number!");
        return newNum();
    }

    //Searching
    public static void searchGuy() throws IOException {
        allGuys(); //shows list
        System.out.println("Who would you like to search for?");
        String searchGuy = findGuy();
        System.out.printf("%n%nHere is your victim:%n%s%n---------%n",searchGuy);
    }
    public static String findGuy(){
        String randomGuy = input.nextLine(); //This is case-sensitive!
        if (!randomGuy.matches("[a-zA-Z ]+")){
            System.out.println("Check your name format...");
            return findGuy();
        }
        for (String contact : contacts) {
            if(contact.contains(randomGuy)) return contact;
        }
        System.out.println("Who?");
        return findGuy();
    }

    //Removing by name
    public static void deleteGuy() throws IOException {
        allGuys(); //Shows before the damage
        System.out.println("Who would you like to remove?");
        String byeGuy = findGuy();
        contacts.remove(byeGuy);
        allGuys(); //Post trauma
    }

    //Exit
    public static boolean endGame(){
        return false;
    }
    //Backup
    public static void backUp() throws IOException {
        reset();
        allGuys();
    }
}
