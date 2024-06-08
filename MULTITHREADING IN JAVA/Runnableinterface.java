public class Runnableinterface implements Runnable {
    
    // This interface also have abstract run method ....but runnable interface doesnt have 
    // start method to start the thread 
    //Thats why we can use Thread class object to call the run method becouse thread class have 
    // internally start the thread using start ();

    // Lets see how can we do that..

    @Override
    public void run(){
        for(int i = 0 ; i<=5 ; i++){
            System.out.println("khaja ameen ...");
        }
    }

    public static void main(String[] args) {
        for (int i = 0 ; i <= 10 ; i++){
            System.out.print(i);
        }

        Runnableinterface runnable = new Runnableinterface();     // class object ...
        Thread tt = new Thread(runnable);       // Thread object to call the run method internally
        tt.start();                   // This is start method to call the run method internally..

    }
}
