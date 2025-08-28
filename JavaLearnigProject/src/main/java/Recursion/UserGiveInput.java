package Recursion;

import java.util.Scanner;

public class UserGiveInput {
    static int Fact(int n){
        if (n==0 || n==1){
            return 1;
        }
        return n * Fact(n-1);
    }

    public static void main(String[] args) {
        Scanner cd = new Scanner(System.in);
        System.out.println("Enter the number to find its factorial:");
              int d = cd.nextInt();
          int result = Fact(d);

        System.out.println("The factorial of " + d + " is: " + result);

        Reverse_string BackWardTraversal = new Reverse_string();
        String Traversal = "Blutooth";
        String fg = BackWardTraversal.reversStringT(Traversal);
        System.out.println("the string:"+fg);
    }
}
