package ContactsClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DefaultContacts extends ContactPath {

    public static List<String> contacts;

    //Getting .txt info
    static {
        try {
            contacts = reader();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //Adding
    public static  List<String> addContacts(String newContact){
        contacts.add(newContact);
        return contacts;
    }

    //Reset
    public static void reset(){
        contacts = new ArrayList<String>() {
            {
                add("John Wick | 1234567890");
                add("Peter Griffen | 1239603928");
                add("John Cena | 0192847263");
            }
        };

    };





}
