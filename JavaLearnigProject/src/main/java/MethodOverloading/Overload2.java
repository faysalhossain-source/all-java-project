package MethodOverloading;

public class Overload2 {
    void loardOfpuss(){
        System.out.println("Nothing puss the parameter");

    }
    void loardOfpuss(int a,int b){
        System.out.println("loardOfpuss is:"+(a+b));
    }
    void loardOfpuss(double e,int f){
        System.out.println("Double first, Int second:"+(f*e));
    }
    void loardOfpuss(int a,double b){
        System.out.println("Int first, Double second: "+(a-b));
    }

    void loardOfpuss(float g, int h,double j){
        System.out.println("loardOfpuss is:"+(g+j-h));
    }
    void loardOf(float a,long b,int c){
        System.out.println(a+b/c);
    }
    void Varargs(String...names){///varargs
        System.out.println("Total names:"+names.length);

        for (String name : names){
            System.out.println("Name:"+name);
        }
    }
    void Coffeeshop(String...name){
        System.out.println("Total number:"+name.length);
        for (String cd : name){
            System.out.println("Name:"+cd);
        }
    }
    /// static
    static void UseStaticMethods(){
        System.out.println("No param");
    }
    static void UseOfStatics(int a,float b,double c,long d){
        System.out.println(a+b-c/d);
    }
    static void Staticmethod(String...names){
        System.out.println("Toptal Name:"+names.length);
        for (String name : names){
            System.out.println("Name:"+name);
        }

    }
}
