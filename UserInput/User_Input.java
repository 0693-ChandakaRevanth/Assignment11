package Day11.UserInput;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        try(FileWriter writer=new FileWriter("UserInput/user_input.txt",true)){
            System.out.println("Enter Data to be entered in the file and enter stop to end the process: ");
            while(!(str=sc.nextLine()).equals("stop")){
                writer.write(str);
                writer.write("\n");
            }
            writer.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
