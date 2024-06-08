public class Hiraricle_inheritance {
    public void Details(){
        System.out.println("BANK OF BARODA");
    }
}
class Subclass1 extends Hiraricle_inheritance{

    int number = 8543927;
    String name = "khaja ameen";
    public void disp(){
        System.out.println("Account number:"+number);
        System.out.println("Name:"+name);
    }
}
class Subclass2 extends Hiraricle_inheritance{

    int number = 596853;
    String name = "kenzee jod";
    public void disp(){
        System.out.println("Account number:"+number);
        System.out.println("Name:"+name);
    }
}
class Subclass3 extends Hiraricle_inheritance{

    int number = 2387148;
    String name = "iwntRESPECT";
    public void disp(){
        System.out.println("Account number:"+number);
        System.out.println("Name:"+name);
    }

    public static void main(String[] args) {
        Subclass1 s1 = new Subclass1();
        Subclass2 s2= new Subclass2();
        Subclass3 s3 = new Subclass3();

        s1.Details();
        s1.disp();
        s2.Details();
        s2.disp();
        s3.Details();
        s3.disp();

    }
}