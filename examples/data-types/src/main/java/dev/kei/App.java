package dev.kei;


public class App 
{
    public static void main( String[] args )
    {
        // Primitive data types
        byte b = 100;
        short s = 1000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 10.5;
        boolean flag = true;
        char letter = 'A';

        // Reference data types
        String str = "Hello, World!";
        int[] arr = {1, 2, 3, 4, 5};

        // Printing primitive data types
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("boolean: " + flag);
        System.out.println("char: " + letter);

        // Printing reference data types
        System.out.println("String: " + str);
        System.out.println("Array: " + java.util.Arrays.toString(arr));

        // Using classes and objects
        Dog myDog = new Dog();
        myDog.setName("Buddy");
        myDog.setAge(3);
        System.out.println("Dog Name: " + myDog.getName() + ", Age: " + myDog.getAge());

        // Using interfaces
        Dog anotherDog = new Dog();
        anotherDog.eat();
    }
}

interface Animal {
    void eat();
}

class Dog implements Animal {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("Dog is eating");
    }
}