package Day11.ReverseContent;

import java.io.*;

public class Reversed_Content {
    static void reversed_content(){
        try(BufferedReader reader=new BufferedReader(new FileReader("ReverseContent/input1.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("ReverseContent/reversed.txt",true))){
            String s;
            while((s= reader.readLine())!=null){
                String[] str=s.split("\\s+");
                StringBuilder abc=new StringBuilder();
                for(int i=str.length-1;i>=0;i--){
                    abc.append(str[i]);
                    abc.append(" ");
                }
                writer.write(abc.toString()+"\n");
            }
            reader.close();
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        reversed_content();
    }
}
