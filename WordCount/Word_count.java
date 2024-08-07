package Day11.WordCount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Word_count {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("WordCount/wordcount.txt"))){
            int count=0;
            String str;
            while((str=reader.readLine())!=null){
                String[] s=str.split("\\s+");
                for(String c:s){
                    count++;
                    System.out.println(c+"-->"+count);
                }
            }
            reader.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
