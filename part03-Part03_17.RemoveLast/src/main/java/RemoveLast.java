
import java.util.ArrayList;

public class RemoveLast {

    public static void main(String[] args) {
        // Try your method in here
        ArrayList<String> string = new ArrayList<>();
        System.out.println(string);
        removeLast(string);
        
    }
    
    public static void removeLast(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                list.remove(i);
            }
        }
        return;
    }

}
