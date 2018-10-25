package Temp;

public class Mammal implements Animal {

    @Override
    public void reproduce(){
        System.out.println("Mammal -> Reproduce)");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {
        System.out.println("Mammal -> Eat");
    }

    public void huntMice(){
        System.out.println("Mammal -> Hunt Mice");
    }
}
