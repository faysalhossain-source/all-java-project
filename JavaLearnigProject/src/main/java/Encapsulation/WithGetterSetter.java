package Encapsulation;

public class WithGetterSetter {
    private String name;
    private int age;
    private String email;

    public String getName(){
        return name;
    }
    public void setName(String Name){
        this.name = Name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int Age){
        this.age=Age;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
