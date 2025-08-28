package LambdaExpression;

public class lamdaMain {
    public static void main(String[] args) {
        System.out.println("this is the lambda practice");


///create seperate class implements the interface in the class
//        Entry enter = new MyEntry();
//        enter.minka();

        ///Anonymous class
//        MyEntry g = new MyEntry(){
//            @Override
//            public void minka() {
//                System.out.println("this is My First Anonymous Class");
//            }
//        };
//        g.minka();
//
//        MyEntry h = new MyEntry(){
//            @Override
//            public void minka() {
//                System.out.println("My second anonymous class");
//            }
//        };
//        h.minka();

        /// Using our interface with the help of lambda

        Entry O = ()->{
            System.out.println("this My first Use labda");
        };
        O.minka();
        /// {} is optional
        Entry G = ()-> System.out.println("My second use lambda expression");
        G.minka();

        SumInter sumInter = (int a, int b) -> a + b;
        System.out.println("The Sum of"+sumInter.sum(8,6));
        System.out.println("The Sum of"+sumInter.sum(88,36));


        SumInter gg = (a,b)->a + b;
        int result = gg.sum(9,6);
        System.out.println("the sum of :" +result);


        //String Length

        StrinLngth ff = faysal -> faysal.length();

        System.out.println("Lenght of the string is :"+ff.getLength("I'm overmoon"));



    }

}
