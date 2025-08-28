package Recursion;

public class Reverse_string {
    static String reversString(String dd){
        StringBuilder hulululoo = new StringBuilder();

        // Traverse on s in backward direction
        // and add each character to a new string
        for (int i= dd.length()-1; i >=0; i--) {

            hulululoo.append(dd.charAt(i));
        }
        return hulululoo.toString();
    }

    public static void main(String[] args) {
        String dd ="faysal hossain";
        String halum = reversString(dd);
        System.out.println(" revers String is:"+halum);

        /// for nonstatic methods calls

        String s = "Fazlul Karim";
        String result = reversString(s);
        System.out.println("the reversString is :"+result);

        OtherWaySolution hdd = new OtherWaySolution();
        int ssd = hdd .findSum(8);//nonstatic methods call from OtherWaySolution
        System.out.println("Sum is :"+ssd);
        System.out.println();
        System.out.println("Sum:"+hdd.findSum(10));///second way to call of this methods

    }

    public String reversStringT(String s){

        String red = new StringBuilder(s).reverse().toString();
        return red;
    }


}
