class Singel_inheritance{

   String name ="khaja ameen";

}

class Subclass extends Singel_inheritance {

    int age = 24;
    String colour ="brown";
    
   public static void main(String args[]){
    Subclass sc = new Subclass();
    System.out.print("NAME :"+ sc.name);
    System.out.print("AGE :"+sc.age);
    System.out.print("COLOUR :"+sc.colour);
   }

}