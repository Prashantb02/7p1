package java_seminar;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToMyFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("prashant.txt");
            myWriter.write("Name:PRASHANT BANKAR\n");
            myWriter.write("Roll.No.:TACO22153\n");
            myWriter.write("DIV:A\n");
            myWriter.write("DEPT.:COMPUTER DEPT.\n");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}