package MethodOverriding;

public class Cat extends Overtting_Animal{
    @Override
    void sound() {
        super.sound();
        System.out.println("Cat meou");
    }
}
