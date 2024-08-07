package FIileNIOLevel1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadLinebyLine {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\ajay.gattu\\newProject3\\file1.txt");

        try{
            Files.lines(path).forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
