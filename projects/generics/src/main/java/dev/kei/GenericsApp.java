package dev.kei;

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
