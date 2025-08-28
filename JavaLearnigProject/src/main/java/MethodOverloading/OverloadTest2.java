package MethodOverloading;

public class OverloadTest2 {
    public static void main(String[] args) {
        Overload2 isdb = new Overload2();

        isdb.loardOfpuss();
        isdb.loardOfpuss(5,2);
        isdb.loardOfpuss(2.3,4);
        isdb.loardOfpuss(25,5.30);
        isdb.loardOfpuss(44,25,22);
        isdb.loardOf(23,582,23);
        isdb.Varargs("MD.Faysal Hossain","Habib","ruhul amin");
        isdb.Coffeeshop("rahul","karul","hassan","guru");
        /// static methods that's why should call class name
        Overload2.UseStaticMethods();
        Overload2.UseOfStatics(23,52,32,45);
        Overload2.Staticmethod("faysal","fatima","humaira","fahmida");




    }
}
