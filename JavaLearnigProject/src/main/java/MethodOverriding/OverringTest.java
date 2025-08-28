package MethodOverriding;

public class OverringTest {
    public static void main(String[] args) {
        Overtting_Animal Oa = new Overtting_Animal();
        Oa.sound();

        Dog dg = new Dog();
        dg.sound();

        Cat ct = new Cat();
        ct.sound();

        /// static override methods

        Parents.show();
        child.show();
        subclass.show();

        Parents ob = new child();
        ob.hashCode();
    }
}
