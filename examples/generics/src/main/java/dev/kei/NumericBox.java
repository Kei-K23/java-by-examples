package dev.kei;

/**
 * A generic class that represents a box containing a numeric value.
 * The type of the numeric value is specified by the type parameter T,
 * which must be a subclass of the Number class.
 *
 * @param <T> the type of the numeric value to be stored in the box
 */
public class NumericBox <T extends Number>{

    /**
     * The private field to store the numeric value.
     */
    private T t;

    /**
     * Sets the numeric value in the box.
     *
     * @param t the numeric value to be stored in the box
     */
    public void setT(T t) {
        this.t = t;
    }

    /**
     * Retrieves the numeric value from the box.
     *
     * @return the numeric value stored in the box
     */
    public T getT() {
        return t;
    }
}
