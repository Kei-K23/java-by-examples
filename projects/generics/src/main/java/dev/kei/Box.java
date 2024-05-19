package dev.kei;

/**
 * A generic class representing a box that can hold any type of object.
 *
 * @param <T> The type of object that the box can hold.
 */
public class Box<T> {

    /**
     * The object that the box holds.
     */
    private T t;

    /**
     * Sets the object that the box holds.
     *
     * @param t The object to be set.
     */
    public void setT(T t) {
        this.t = t;
    }

    /**
     * Gets the object that the box holds.
     *
     * @return The object that the box holds.
     */
    public T getT() {
        return t;
    }
}
