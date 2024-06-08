class Method_overloding{
    int a , b , c ;
    public void add(){
        a = 10 ; b = 20 ;
        c = a+b ;
        System.out.print("Sum :"+c);
    }

    public void add(int x, int y){
        int z ;
        z = x + y;
        System.out.println("sum of x and y : "+z);


    }

    public static void main(String[] args) {
        Method_overloding mo = new Method_overloding();
        mo.add(); 
        mo.add(100 ,200);
    }
}
