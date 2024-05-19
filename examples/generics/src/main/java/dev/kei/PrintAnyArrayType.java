package dev.kei;

/**
 * This class contains a static method to print any type of array.
 * The method uses Generics to accept any type of array as input.
 */
public class PrintAnyArrayType {

    /**
     * Prints all elements of the given array to the console.
     *
     * @param <T> The type of elements in the array.
     * @param array The array to be printed.
     * @return This method does not return any value.
     */
    public static <T> void printArray(T[] array) {
        // Loop through each element in the array and print it
        for (T element : array) {
            System.out.println(element);
        }
    }
}
