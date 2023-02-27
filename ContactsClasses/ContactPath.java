package ContactsClasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ContactPath {
    public static String contacts = "contacts.txt";

    public static Path contactLocation(){
        Path fileName = Paths.get(contacts);

        try{
            Path directoryCreation = Files.createFile(fileName);
        }catch(IOException ixo){
            System.out.println(ixo);
        };
        return fileName;
    }

    public static void main(String[] args) {
        contactLocation();
    }




}
