package Module10;


import java.io.*;
import java.util.*;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class FileHelper {
    public void printValidTelNumbersFromFile(File file) {
        if (file.exists()) {
            InputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String telNumber = scanner.nextLine();
                if (telNumber.matches("\\(?\\d+\\)?-?\\s?\\d+\\-\\d+")) {
                    System.out.println(telNumber);
                }
            }
        }
    }

    public void changeFileType(File file) {
        if (file.exists()) {
            InputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Scanner scanner = new Scanner(fis);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            OutputStream fos = null;
            try {
                fos = new FileOutputStream("user.json");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            String pattern = "\\w+\\s\\d+";
            while (scanner.hasNext()) {
                String s = scanner.nextLine();
                if (s.matches(pattern)) {
                    String[] data = s.split(" ");
                    String name = (data[0]);
                    int age = Integer.parseInt(data[1]);
                    Person person = new Person(name, age);
                    String jsonString = gson.toJson(person);
                    try {
                        fos.write(jsonString.getBytes());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public void countNumbersOfWordsInFile(File file) {
        if (file.exists()) {
            InputStream fis = null;
            try {
                fis = new FileInputStream(file);
            } catch (IOException e) {
                e.printStackTrace();
            }
            ArrayList<String> array = new ArrayList<>();
            LinkedHashSet set = new LinkedHashSet();
            Map<String, Integer> hashMap = new HashMap<>();
            Scanner scanner = new Scanner(fis);
            while (scanner.hasNext()) {
                String line = scanner.next();
                String[] words = line.split(" ");
                for (String word :
                        words) {
                    array.add(word);
                    set.add(word);
                }
            }
            for (int i = 0; i < set.size(); i++) {
                int count = 0;
                String value = array.get(i);
                for (int j = 0; j < array.size(); j++) {
                    if (value.equals(array.get(j))) {
                        count++;
                    }
                }
                Word word = new Word(value, count);
                hashMap.put(word.getValue(), word.getCount());

            }
            Integer[] values = hashMap.values().toArray(new Integer[set.size()]);
            Arrays.sort(values);
            for (int j = values.length - 1; j >= 0; j--) {
                for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
                    if (entry.getValue().equals(values[j])) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                    }
                }
            }
        }
    }



}


