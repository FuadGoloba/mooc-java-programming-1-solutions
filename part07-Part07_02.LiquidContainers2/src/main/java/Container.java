public class Container {
    private static final int MAX_VOLUME = 100;
    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return this.volume;
    }

    public boolean isNegative(int amount) {
        return amount < 0;
    }

    public void add(int amount) {
        if (isNegative(amount)) {
            return; 
        }
        this.volume += amount;
        if (this.volume > MAX_VOLUME) {
            this.volume = MAX_VOLUME;
        }
    }

    public void remove(int amount) {
        if (isNegative(amount)) {
            return;
        }
        this.volume -= amount;
        if (this.volume < 0) {
            this.volume = 0;
        }
    }

    public String toString() {
        return this.volume + "/" + MAX_VOLUME;
    }
}
