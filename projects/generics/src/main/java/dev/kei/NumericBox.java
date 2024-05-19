package dev.kei;

public class NumericBox <T extends Number>{
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }
}
