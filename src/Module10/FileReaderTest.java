package Module10;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReaderTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("file.txt");
        System.out.println(file.exists());
        FileHelper helper = new FileHelper();
        helper.printValidTelNumbersFromFile(file);

    }
}
