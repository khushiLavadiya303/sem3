1.Example of fileinputstream class to read data from text file.
import java.io.*;
public class fileInputstream {
    public static void main(String args[]) {
        try {
            // Note: Make sure to create a text file named "input.txt" in your project folder first[span_1](start_span)[span_1](end_span)
            FileInputStream input = new FileInputStream("input.txt");
            System.out.println("Data in the file: ");
            int i = input.read();
            while (i != -1) {
                System.out.print((char) i);
                i = input.read();
            }
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

2.Example of fileoutputstream to write text into file.
import java.io.FileOutputStream;
public class foutputstream {
    public static void main(String args[]) {
        try {
            String data = "this is a line of text inside the file";
            FileOutputStream output = new FileOutputStream("output.txt");
            byte[] array = data.getBytes();
            // writes byte to the file
            output.write(array);
            output.close();
            System.out.println("Data written to output.txt successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

3.w.a.p to read data from file using file reader class.
import java.io.FileReader;
public class file_reader {
    public static void main(String args[]) {
        try {
            char[] array = new char[100];
            // Make sure "input.txt" exists in your project folder
            FileReader fr = new FileReader("input.txt");
            fr.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

4.w.a.p to copy one file into another file.
import java.io.FileReader; // import java.io.*;	
import java.io.FileWriter;
import java.io.IOException;
public class copy {
    public static void main(String[] args) {
        try {
            // Make sure "A1.txt" exists with some text inside it before running!
            FileReader fr = new FileReader("A1.txt");
            FileWriter fw = new FileWriter("A2.txt");            
            int i;
            while ((i = fr.read()) != -1) {
                fw.write(i);
            }
            fr.close();
            fw.close();
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error -- " + e);
        }
    }
}