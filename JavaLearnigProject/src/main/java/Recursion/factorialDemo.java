package Recursion;

public class factorialDemo {
    static int Fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * Fact(n-1);

    }

    public static void main(String[] args) {
        int d = Fact(6);
        System.out.println("Factorial"+d);
    }
}
