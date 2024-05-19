package dev.kei;

// In Java, generics are a language feature that allows you to write classes,
// interfaces, and methods with a placeholder for types, providing type safety at compile time without needing to cast objects.
// Generics enable you to create code that is more flexible, reusable, and easier to read.

// Why Use Generics?
// Type Safety: They provide stronger type checks at compile time.
// Elimination of Casts: You don't need to cast objects.
// Code Reusability: You can write a generic algorithm that works with different data types.
// Syntax of Generics
// Generics are specified using angle brackets <>. Inside the brackets, you define the type parameter.


public class GenericsApp
{
    public static void main( String[] args )
    {
        // Box generic
        Box<Integer> integerBox = new Box<>();
        integerBox.setT(10);
        System.out.println(integerBox.getT());
        Box<String> stringBox = new Box<>();
        stringBox.setT("Hello");
        System.out.println(stringBox.getT());

        String[] stringArray = {"A", "B", "C"};
        Integer[] intArray = {1, 2, 3};

        // PrintAnyArrayType generic method
        PrintAnyArrayType.printArray(stringArray);
        PrintAnyArrayType.printArray(intArray);

        // NumericBox generic class
        NumericBox<Integer> integerNumericBox = new NumericBox<>();
        integerNumericBox.setT(10);
        System.out.println(integerNumericBox.getT());

//        Error NumericBox is use  Bounded Type Generics Parameters only for numeric type
//        NumericBox<String> stringNumericBox = new NumericBox<>();
//        stringNumericBox.setT("Hello");
//        System.out.println(stringNumericBox.getT());
    }
}
