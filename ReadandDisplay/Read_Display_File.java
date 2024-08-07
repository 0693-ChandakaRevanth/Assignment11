package Day11.ReadandDisplay;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Read_Display_File {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("ReadandDisplay/Input.txt"))
            ){
            String str;
            while ((str=reader.readLine())!=null){
                System.out.println(str);
            }
            reader.close();
        }
        catch (IOException e){
            e.getMessage();
        }
    }
}
