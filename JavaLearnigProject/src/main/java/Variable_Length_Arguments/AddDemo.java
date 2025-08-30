package Variable_Length_Arguments;

public class AddDemo {

//    void Add(int num1,int num2){
//       int result= num1+num2;
//        System.out.println("Result="+result);
//    }
//    void add(int num1,int num2,int num3){
//        System.out.println("Result="+num1+num2+num3);
//    }
/// if you want you can use loop in this methods
    void add(int ... num){
        int sum = 0;
        for(int x: num){//for hence loop/enhance for loop
            //sum = sum + x;
            sum +=x;
        }
        System.out.println(sum);
    }
}
