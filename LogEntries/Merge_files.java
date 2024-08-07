import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.List;
        public class Merge_files {
            public static void main(String[] args) {
                List<String> fileName = Arrays.asList("Transactions.txt", "New_Transaction.txt");
                Merging obj = new  Merging();
                obj.merge(fileName,"Merged.txt");
            }
        }
        class Merging {
            static void merge(List<String> fileNames, String outputFilename) {
                try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(outputFilename))) {
                    for(int i=0;i<fileNames.size();i++){
                        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileNames.get(i)))){
                            String line;
                            while ((line = bufferedReader.readLine()) != null) {
                                bufferedWriter.write(line);
                                bufferedWriter.newLine();
                            }
                        } catch (Exception e) {
                            System.err.println("Error reading file at filename : " + fileNames);

                        }
                    }
                    System.out.println("Written successfully");
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
