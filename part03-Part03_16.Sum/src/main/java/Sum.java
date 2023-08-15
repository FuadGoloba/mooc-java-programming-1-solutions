
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        // Try your method here
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println(sum(numbers));
    }
    
    public static int sum(ArrayList<Integer> numbers) {
        int total = 0;
        for (int number: numbers) {
            total += number;
        }
        
        return total;
    }

}
