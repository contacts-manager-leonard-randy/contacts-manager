import java.io.IOException;

import static ContactsClasses.util.*;

public class ContactsManager {
    private static boolean keepRunning = true;

    public static void optionX(int userNum) throws IOException {
        switch (userNum) {
            case 1 -> allGuys();
            case 2 -> newGuy();
            case 3 -> searchGuy();
            case 4 -> deleteGuy();
            case 5 -> keepRunning = endGame();
            case 9 -> backUp();
        }
    }

    public static void main(String[] args) throws IOException {

//        System.out.println(contactLocation());
        while(keepRunning) {
            optionX(optionEval());

        }

    }
}
