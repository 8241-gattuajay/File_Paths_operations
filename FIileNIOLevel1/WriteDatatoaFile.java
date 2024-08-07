package FIileNIOLevel1;

import java.nio.file.*;

public class WriteDatatoaFile {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\ajay.gattu\\newProject3\\file1.txt");

        try{
            if(!Files.exists(path)){
                StandardOpenOption.CREATE_NEW.toString();
            }
            Files.write(path, "I am good".getBytes(), StandardOpenOption.APPEND);
            Files.lines(path).forEach(System.out::println);
        }
        catch (Exception e){
            e.printStackTrace();
    }
}
}
