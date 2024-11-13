package BonusTask;

public class Detective {

    private boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    public boolean isSpy(Person p) {
        return isPowerOfTwo(p.getGeneratedKey());
    }
}
