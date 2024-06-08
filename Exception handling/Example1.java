class Example1{

    public static void main(String args[]){

        try{

            int [] numbers = {1,2,3,4};
            System.out.println(numbers[5]);          
            // for this we get ArrayIndexOutofbound exception becouse we are accessing the 5 index thats not exits 
            // our array contains only 4 elements ..
        }catch(Exception e){
            System.out.println("Index is not present in the array ...");
        }finally{
            System.out.println("This block always exicute weather exception occured or not ..!");
        }
        
          
            
       
    }
}