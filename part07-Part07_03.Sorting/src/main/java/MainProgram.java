
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {8, 3, 7, 9, 1, 2, 4};
        System.out.println(smallest(array));
        System.out.println(indexOfSmallest(array));
        System.out.println(indexOfSmallestFrom(array, 2));
        //swap(array, 1, 0);
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static int smallest(int[] array) {
        int index = 0;
        int smallest = array[0];
        while (index < array.length) {
            if (smallest > array[index]) {
                smallest = array[index];
            }
            index++;
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int index = 0;
        int smallest = array[0];
        int indexOfSmallest = 0;
        while (index < array.length) {
            if (smallest > array[index]) {
                smallest = array[index];
                indexOfSmallest = index;
            }
            index++;
        }
        return indexOfSmallest;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        int indexOfSmallest = startIndex;
        while (startIndex < table.length) {
            if (smallest > table[startIndex]) {
                smallest = table[startIndex];
                indexOfSmallest = startIndex;
            }
            startIndex++;
        }
        return indexOfSmallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int index = 0;
        while (index < array.length - 1) {
            System.out.println(Arrays.toString(array));
            int smallestFromIndex = indexOfSmallestFrom(array, index);
            swap(array, index, smallestFromIndex);
            index++;
        }
    }

}
