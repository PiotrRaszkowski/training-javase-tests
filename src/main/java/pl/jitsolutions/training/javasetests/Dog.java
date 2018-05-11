package pl.jitsolutions.training.javasetests;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }

    @Override
    public void run() {
        System.out.println("Dog is running...");
    }

    @Override
    public String speak() {
        return "hau hau...";
    }
}
