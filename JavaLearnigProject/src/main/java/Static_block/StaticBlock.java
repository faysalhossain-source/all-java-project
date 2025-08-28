package Static_block;

public class StaticBlock {

    static int id;
    static String name;

    static {
        id = 420;
        name = "faysal";
    }

    static void Faysal(){
        String n;
        System.out.println("ID ="+id +"\n"+"Name ="+name);
    }

   /**
    *  public static void main(String[] args) {
        StaticBlock.Faysal();
    }*/
}
