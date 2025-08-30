package Encapsulation;

public class encapsulationTest {
    public static void main(String[] args) {
        encapsulation Isdb62 = new encapsulation();
        Isdb62.Name="Md.Faysal Hossain";
        Isdb62.Age=29;
        Isdb62.Phone= "01676565882";
        Isdb62.Email="faysalhossain4455@gmail.com";
        Isdb62.Password=225252;
        Isdb62.display();
        Isdb62.equals("Name");
        Isdb62.hashCode();

        System.out.println();
        System.out.println();


        WithGetterSetter ob = new WithGetterSetter();
        ob.setName("Md.Faysal Hossain");
        ob.setAge(29);
        ob.setEmail("faysalhossain4455@gmail.com");

        System.out.println("Name:"+ob.getName());
        System.out.println("Age:"+ob.getAge());
        System.out.println("Email:"+ob.getEmail());
    }
}
