package Module10;

import java.io.*;
import java.util.Scanner;

public class FileHelper {
    public void printValidTelNumbersFromFile(File file) throws FileNotFoundException {
        if (file.exists()) {
            InputStream fis = new FileInputStream(file);
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String telNumber = scanner.nextLine();
                if (telNumber.matches("\\(?\\d+\\)?-?\\s?\\d+\\-\\d+")) {
                    System.out.println(telNumber);
                }
            }
        }
    }
}
