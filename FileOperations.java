import java.io.*;

public class FileOperations {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Hello, this is Java file handling.");
            writer.write("\nWelcome to file operations.");

            writer.close();

            FileReader reader = new FileReader("sample.txt");

            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}