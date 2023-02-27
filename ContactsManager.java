import java.io.IOException;

import static ContactsClasses.util.*;

public class ContactsManager {
    public static void main(String[] args) throws IOException {
        boolean keepRunning = true;
        while(keepRunning) {
        int userNum = optionEval();
            switch (userNum) {
                case 1 -> allGuys();
                case 2 -> newGuy();
                case 3 -> searchGuy();
                case 4 -> deleteGuy();
                case 5 -> keepRunning = endGame();
                case 9 -> backUp();
            }
        }
    }
}
