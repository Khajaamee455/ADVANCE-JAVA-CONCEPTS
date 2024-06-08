public class Multilevel_inheritance {
    
    int a , b , c;
    
    public void add(){
        a = 10 ; b=20 ;
        c = a+b ;
        System.out.println("Sum of two numbers: "+c);

    }

    public void substraction(){
        a = 200; b = 100;
        c= a-b;
        System.out.println("Substraction of two numbers :"+c);
    }
}

class Subclass extends Multilevel_inheritance{

    public void multiply(){
        a = 2  ; b = 8 ;
        c = a*b ;
        System.out.println("Multiplication of two numbers :"+c);
    }

    public void div(){
        a = 500 ; b = 100;
        c = a/b ;
        System.out.println("division of two numbers :"+c);
    }
}

class Result extends Subclass{

    public static void main(String[] args) {
        Result rs = new Result();
        rs.add();
        rs.substraction();
        rs.multiply();
        rs.div();
    }
} 
