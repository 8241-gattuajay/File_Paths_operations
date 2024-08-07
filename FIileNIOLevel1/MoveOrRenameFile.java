package FIileNIOLevel1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveOrRenameFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\ajay.gattu\\newProject3\\file1.txt");
        try{
            Files.move(path,Paths.get("C:\\Users\\ajay.gattu\\newProject3\\file3.txt"), StandardCopyOption.REPLACE_EXISTING);
            Files.lines(Paths.get("C:\\Users\\ajay.gattu\\newProject3\\file3.txt")).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
