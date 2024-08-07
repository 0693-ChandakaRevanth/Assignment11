import java.io.*;
import java.util.Scanner;

public class Large_Data_File {
    public static void main(String[] args) {
        try(BufferedReader reader=new BufferedReader(new FileReader("Transaction.txt"));
            BufferedWriter writer=new BufferedWriter(new FileWriter("Filtered_Transaction.txt"));){
            String str;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter Threshold Amount: ");
            int amount=sc.nextInt();
            while((str=reader.readLine())!=null){
                String[] s=str.split(",");
                int a=Integer.parseInt(s[2]);
                if(a>amount){
                    writer.write(s[0]+",");
                    writer.write(s[1]+",");
                    writer.write(s[2].toString()+",");
                    writer.write(s[3]+"\n");
                }
            }
            System.out.println("Data is successfully entered into Filtered Transaction File.");
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
