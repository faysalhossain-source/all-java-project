package Variable_Length_Arguments;

public class AddDemoTest {
    public static void main(String[] args) {
        AddDemo puski = new AddDemo();
        puski.add(20,30);
        puski.add(20,60,30);
        puski.add(20,60,80,70,90,30,60);
    }
}
