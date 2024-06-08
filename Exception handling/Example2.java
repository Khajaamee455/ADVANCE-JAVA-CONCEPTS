public class Example2 {
    
    // if we divide any number by 0 we get Arthmatic exception 
   
       public static void main(String[] args) {
        
       try{
        int a = 10 , b =0  , result ;
        result = a/b;
        System.out.println(result);

       }catch(Exception e){
        System.out.println("Cannot divide by zero ");
       }

    }
       }
