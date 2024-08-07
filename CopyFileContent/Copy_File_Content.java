package Day11.CopyFileContent;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Copy_File_Content {
    public static void main(String[] args) {
        try (FileReader reader = new FileReader("CopyFileContent/Source.txt");
             FileWriter writer = new FileWriter("CopyFileContent/Destination.txt",true)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Content Copied Successfully to Destination File.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}