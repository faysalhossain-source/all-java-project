package PassTheArgumentValue;

public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue cbl = new CallByValue();
        int x = 20;
        System.out.println("x before call :"+x);

        cbl.change(x);
        System.out.println("x after call:"+x);
    }
}
