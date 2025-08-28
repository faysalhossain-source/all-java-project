package PassTheArgumentValue;


public class CallByReferenceTest {

    public static void main(String[] args) {

        CallByReference CBR = new CallByReference();

        CBR.name="FAysal";
        System.out.println("before call :"+CBR.name);

        CBR.UsaoO(CBR);
        System.out.println("after call:"+CBR.name);
    }
}
