package Recursion;

public class RecursionDemo {
    static void printNumber( int n){
        if (n==0){
            return ; ///base case
        }
        System.out.println(n);
        printNumber(n-1);


    }

    public static void main(String[] args) {

        printNumber(5);

        RecursionOfvarargs obj = new RecursionOfvarargs();
        int result = obj.fact(8);
        int result1 = obj.fact(9);
        int result2 = obj.fact(10);
        int result3 = obj.fact(11);
        System.out.println("recursion result is:"+result+"\n"+result1+"\n"+result2+"\n"+result3);
    }
}
