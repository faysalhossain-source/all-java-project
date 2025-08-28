package LambdaExpression;

public class ThreadDemo {
    public static void main(String[] args) {
        /// first Thread :Thread - JOHN


        Runnable thread1 = ()->{
          //this the of the thread
          ///stuff

        for (int i = 0;i <= 10; i++){
            System.out.println("Value of i is "+ i);

            try {
                Thread.sleep(1000);
            }catch(InterruptedException exception){
                exception.printStackTrace();
            }

            }
        };
        Thread tt = new Thread(thread1);
        tt.setName("John");
        tt.start();


        Runnable thread2 = ()-> {

            try {
                for (int i = 0; i <= 10; i++) {
                    System.out.println(i * 2); ///print here
                    Thread.sleep(2000);

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        };
        Thread ttt = new Thread(thread2);
        ttt.setName("Junu");
        ttt.start();

    }
}
