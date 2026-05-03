package exercises.interfaces;

import exercises.interfaces.breakable.Breakable;
import exercises.interfaces.breakable.Concrete;
import exercises.interfaces.breakable.Glass;
import exercises.interfaces.breakable.SuperConcrete;
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

//      sortMethod(originalArray);
//      flyableMethod();
//      isBreakable();
//      isObjBreakable();
//      isFlameable();
        displayMessage();

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

    public static void isBreakable() {
        Glass glass = new Glass();
        Concrete concrete = new Concrete();

        System.out.println("Glass object is breakable: " + glass.objectIsBreakable());
        System.out.println("Concrete object is breakable: " + concrete.objectIsBreakable());
    }

    public static void isObjBreakable() {
        SuperConcrete superConcrete = new SuperConcrete();

        System.out.println("SuperConcrete object is breakable: " +
                superConcrete.objectIsBreakable());
//Ответ на вопрос:
//Будет использована реализация метода objectIsBreakable()
// из класса Concrete, которая возвращает false.
    }

    public static void isFlameable() {
        Glass glass = new Glass();
        Concrete concrete = new Concrete();
        SuperConcrete superConcrete = new SuperConcrete();

        System.out.println("=== Verification objectIsFlameable() ===");
        System.out.println("Glass object is flameable: " + glass.objectIsFlameable());
        System.out.println("Concrete object is flameable: " + concrete.objectIsFlameable());
        System.out.println("SuperConcrete object is flameable: " + superConcrete.objectIsFlameable());

        System.out.println("\n=== Additional Verification objectIsBreakable() ===");
        System.out.println("Glass object is breakable: " + glass.objectIsBreakable());
        System.out.println("Concrete object is breakable: " + concrete.objectIsBreakable());
        System.out.println("SuperConcrete object is breakable: " + superConcrete.objectIsBreakable());
    }

    public static void displayMessage() {
        System.out.println("=== Testing Glass ===");
        Glass glass = new Glass();
        System.out.print("glass.objectIsBreakable(): ");
        boolean breakable1 = glass.objectIsBreakable();
        System.out.print("glass.objectIsFlameable(): ");
        boolean flameable1 = glass.objectIsFlameable();

        System.out.println("\n=== Testing Concrete ===");
        Concrete concrete = new Concrete();
        System.out.print("concrete.objectIsBreakable(): ");
        boolean breakable2 = concrete.objectIsBreakable();
        System.out.print("\nconcrete.objectIsFlameable(): ");
        boolean flameable2 = concrete.objectIsFlameable();
        System.out.println(" ");

        System.out.println("\n === Testing SuperConcrete ===");
        SuperConcrete superConcrete = new SuperConcrete();
        System.out.print("superConcrete.objectIsBreakable(): ");
        boolean breakable3 = superConcrete.objectIsBreakable();
        System.out.print("\nsuperConcrete.objectIsFlameable(): ");
        boolean flameable3 = superConcrete.objectIsFlameable();
        System.out.println(" ");

        System.out.println("\n=== RESULT ===");
        System.out.println("Glass: causes default-implementation - messages are displayed");
        System.out.println("Concrete: overrides both methods - messages are NOT displayed");
        System.out.println("SuperConcrete: " +
                "inherits overridden objectIsBreakable() from Concrete - " +
                "messages are NOT displayed, ");
        System.out.println("overrides objectIsFlameable() - messages are NOT displayed");

//        Ответ на вопрос:
//        Сообщения в консоль
//        от приватных методов defaultCalled() будут выведены только для класса Glass.
    }

}

