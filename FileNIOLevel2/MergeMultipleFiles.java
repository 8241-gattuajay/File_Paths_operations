package FileNIOLevel2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MergeMultipleFiles {
    public static void main(String[] args) {
        Path path = Paths.get("C:\\Users\\ajay.gattu\\Allfiles");
        Path mergedFile = Paths.get("Merged.txt");

        try{
            Files.list(path).forEach(p->{
                try{
                    Files.lines(p).forEach(line->{
                        try{
                            Files.write(mergedFile, (line + "\n").getBytes(), Files.exists(mergedFile) ? StandardOpenOption.APPEND : StandardOpenOption.CREATE);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    });
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
