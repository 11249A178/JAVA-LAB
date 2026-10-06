import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamDemo {

    public static void main(String[] args) {

        String fileName = "sample.txt";

        try {
            // Writing data to the file
            FileOutputStream output = new FileOutputStream(fileName);

            String data = "Hello! This is Java I/O Stream.";
            output.write(data.getBytes());

            output.close();

            System.out.println("Data written successfully.");

            // Reading data from the file
            FileInputStream input = new FileInputStream(fileName);

            int ch;

            System.out.println("Data read from file:");

            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }

            input.close();

            System.out.println("\nFile closed successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
