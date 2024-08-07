package FIileNIOLevel1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeletePath {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\ajay.gattu\\newProject3\\file1.txt");
        try{
            Files.delete(path);
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
