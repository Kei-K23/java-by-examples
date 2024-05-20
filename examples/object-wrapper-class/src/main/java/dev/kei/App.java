package dev.kei;

/**
 * In Java, an Object Wrapper class is a class that encapsulates a primitive data type in an object.
 * This allows primitive data types to be treated as objects. Java provides wrapper classes for each of
 * the eight primitive data types:
 *
 * <ul>
 *   <li>byte -> {@link Byte}</li>
 *   <li>short -> {@link Short}</li>
 *   <li>int -> {@link Integer}</li>
 *   <li>long -> {@link Long}</li>
 *   <li>float -> {@link Float}</li>
 *   <li>double -> {@link Double}</li>
 *   <li>boolean -> {@link Boolean}</li>
 *   <li>char -> {@link Character}</li>
 * </ul>
 *
 * <h2>Difference Between {@code int} and {@code Integer}</h2>
 *
 * <h3>Data Type:</h3>
 * <ul>
 *   <li>{@code int} is a primitive data type.</li>
 *   <li>{@code Integer} is a class (a reference data type) that wraps a value of the primitive type {@code int} in an object.</li>
 * </ul>
 *
 * <h3>Usage:</h3>
 * <ul>
 *   <li>{@code int} is used for performance-critical and simple numeric operations.</li>
 *   <li>{@code Integer} is used when objects are required, such as in collections (e.g., {@code ArrayList<Integer>}), or when nullability is needed.</li>
 * </ul>
 *
 * <h3>Nullability:</h3>
 * <ul>
 *   <li>{@code int} cannot be null; it always holds a value.</li>
 *   <li>{@code Integer} can be null, which can be useful to indicate the absence of a value.</li>
 * </ul>
 *
 * <h3>Methods:</h3>
 * <ul>
 *   <li>{@code int} does not have methods.</li>
 *   <li>{@code Integer} provides several methods, such as {@link Integer#parseInt(String)}, {@link Integer#valueOf(String)}, and methods for arithmetic operations.</li>
 * </ul>
 *
 * <h3>Autoboxing and Unboxing:</h3>
 * <ul>
 *   <li>Autoboxing is the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes. For example, converting an {@code int} to an {@code Integer}.</li>
 *   <li>Unboxing is the reverse process of converting an {@code Integer} to an {@code int}.</li>
 * </ul>
 */
public class App 
{
    public static void main( String[] args )
    {
        // Using int
        int primitiveInt = 10;
        System.out.println("Primitive int: " + primitiveInt);

        // Using Integer
        Integer wrapperInt = 20;
        System.out.println("Wrapper Integer: " + wrapperInt);

        // Autoboxing
        Integer autoBoxedInt = primitiveInt; // int to Integer
        System.out.println("Autoboxed Integer: " + autoBoxedInt);

        // Unboxing
        int unboxedInt = wrapperInt; // Integer to int
        System.out.println("Unboxed int: " + unboxedInt);

        // Nullability
        Integer nullableInt = null;
        System.out.println("Nullable Integer: " + nullableInt);

        // Methods provided by Integer class
        String str = "123";
        int parsedInt = Integer.parseInt(str);
        System.out.println("Parsed int from String: " + parsedInt);

        // Same for other primitive types with their corresponding object wrapper class
    }
}
