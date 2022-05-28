package l22_demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo2 {
    public static void main(String[] args) {
        createFile("output.txt");
    }

    private static void createFile(String fileName){
        PrintWriter outputFile = null;
        try {
            outputFile = new PrintWriter(new FileWriter(fileName));
            outputFile.println("Hello");
        }catch (IOException e){
            System.err.println("Catch an IOException: " + e.getMessage());
        }finally {
            if (outputFile != null){
                outputFile.close();
                System.out.println("Close file");
            }else {
                System.out.println("File is not open");
            }
        }
    }
}
