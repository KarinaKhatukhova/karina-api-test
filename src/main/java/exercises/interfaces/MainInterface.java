package exercises.interfaces;

import exercises.interfaces.flyables.Airplane;
import exercises.interfaces.flyables.Flyable;
import exercises.interfaces.flyables.Helicopter;
import exercises.interfaces.flyables.Spacecraft;
import exercises.interfaces.sortable.BubbleSort;
import exercises.interfaces.sortable.SelectionSort;
import exercises.interfaces.sortable.Sortable;

import java.util.Arrays;

public class MainInterface {
    public static void main(String[] args) {
        int[] originalArray = {64, 34, 25, 12, 22, 11, 90, 5, 77, 30};

//       sortMethod(originalArray);
       flyableMethod();

    }

    public static void sortMethod(int[] args) {
        System.out.println("Source array: " + Arrays.toString(args));
        System.out.println();

        Sortable bubbleSort = new BubbleSort();
        int[] bubbleSorted = bubbleSort.sort(args);
        System.out.println("Bubble sort: " + Arrays.toString(bubbleSorted));

        Sortable selectionSort = new SelectionSort();
        int[] selectionSorted = selectionSort.sort(args);
        System.out.println("Selection sort: " + Arrays.toString(selectionSorted));
    }

    public static void flyableMethod() {
        Flyable spacecraftObjects = new Spacecraft();
        Flyable airplaneObjects = new Airplane();
        Flyable helicopterObjects = new Helicopter();

        System.out.println(spacecraftObjects.flyObj());
        System.out.println(airplaneObjects.flyObj());
        System.out.println(helicopterObjects.flyObj());
    }
}
