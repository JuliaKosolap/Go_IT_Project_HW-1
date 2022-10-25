package Module10;

import java.io.File;
import java.io.IOException;

public class FileHelperTest {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        System.out.println(file.exists());
        FileHelper helper = new FileHelper();
        helper.printValidTelNumbersFromFile(file);
        File file2 = new File("file2.txt");
        helper.changeFileType(file2);
        File file3 = new File("words.txt");
        helper.countNumbersOfWordsInFile(file3);
    }
}
