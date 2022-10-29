package Module10;

public class Word {

    public String getValue() {
        return value;
    }

    public int getCount() {
        return count;
    }

    private String value;
    private int count;

    Word(String word, int count) {
        this.value = word;
        this.count = count;
    }
}
