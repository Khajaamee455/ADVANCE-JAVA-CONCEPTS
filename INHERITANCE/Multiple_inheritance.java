 
// Note : java does not support multiple inheritance becouse to avoid 
// diamond problems and keep the java language easy and maintanable..
// In multiple inheritance a single class implement multiple interfaces and accessing interface methods 

interface Multiple_inheritance {

abstract  void language();
    
}

interface Another_interface{

    abstract void code();
}

class Printer implements Multiple_inheritance , Another_interface{

    @Override
    public void language(){
        System.out.println("Language is java...");
    }

    @Override
    public void code(){
        System.out.println("learning multiple inheritance..");
    }

    public void status(){
        System.out.println("Done .....!");
    }

    public static void main(String[] args) {
        Printer p = new Printer();
        p.language();
        p.code();
        p.status();
    }
}