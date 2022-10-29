package Module11;

public class MyRandom {
    private final Long a;
    private final int c, m;

    private Long seed;

    public MyRandom(Long a, int c, int m) {
        this.a = a;
        this.c = c;
        this.m = m;
    }
    public MyRandom seed(Long seed) {
        this.seed = seed;
        return this;
    }

    public Long next() {
        return (a * seed + c) % m;
    }
}
