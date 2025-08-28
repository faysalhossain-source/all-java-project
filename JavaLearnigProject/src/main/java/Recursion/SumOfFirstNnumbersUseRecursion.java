package Recursion;

public class SumOfFirstNnumbersUseRecursion {

    static int findSum(int n){
        if (n==1)//// Base case
            return 1;
        return n + findSum(n-1);/// recursive call
    }

    public static void main(String[] args) {
        int sum = 6;
        int result = findSum(sum);
        System.out.println("Sum result is :"+result);


        /// this is for another class(className.methods)
        //int sum = SumOfFirstNnumbersUseRecursion.findSum();

        /// this second way to call static methods
//        int sum = 8;
//        System.out.println("The sum is: " + findSum(sum));
        int Onather = SumOfFirstNnumbersUseRecursion.findSum(5);
        System.out.println("The other result is:"+Onather);

        String ssd = "faysal";
        Reverse_string reversObj = new Reverse_string();
        String hdd = reversObj.reversStringT(ssd);
        System.out.println("The Revers String is :"+hdd);


    }
}
