package ContactsClasses;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;
import static java.nio.file.Files.write;

public class ContactPath {
    private static final String contacts = "contacts.txt";
    private static final Path fileLocation = Paths.get(contacts);

    public static Path contactLocation() throws IOException{
        Path directoryCreation = Files.createFile(fileLocation);
        return fileLocation;
    }

    public static void writer(List<String> info) throws IOException {
        write(fileLocation, info);
    }

    public static List<String> reader() throws IOException{
        List<String>result = Files.readAllLines(fileLocation);
        return result;
    }





}
