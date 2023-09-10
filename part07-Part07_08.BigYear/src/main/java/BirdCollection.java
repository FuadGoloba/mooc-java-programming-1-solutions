import java.util.ArrayList;
public class BirdCollection {
    private ArrayList<Bird> collection;

    public BirdCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(Bird bird) {
        this.collection.add(bird);
    }

    public void printBirds() {
        for (Bird bird: this.collection) {
            System.out.println(bird);
        }
    }

    public Bird findBirdByName(String name) {
        for (Bird bird : this.collection) {
            if (bird.getName().equals(name)) {
                return bird;
            }
        }
        return null;
    }

    public boolean birdExists(String name) {
        for (Bird bird : this.collection) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}
