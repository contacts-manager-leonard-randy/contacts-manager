
import java.io.IOException;
import java.util.Scanner;
import static ContactsClasses.ContactPath.*;
import static ContactsClasses.DefaultContacts.*;

public class ContactsManager {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

//        while(true) {
//        System.out.println(contacts);
//
//        System.out.println("Add a new Contact");
//        String newGuy = sc.nextLine();


            try {
//            writer(contacts);
//             writer(addContacts(newGuy));
                System.out.println(reader());
                writer(reset());
                System.out.println(reader());
            } catch (IOException ioe) {
                System.out.println(ioe);
            }
//        }


    }
}
