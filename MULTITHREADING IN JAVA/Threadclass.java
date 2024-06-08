class Threadclass extends Thread{

    @Override
    public void run(){           // this is Thread class method thats its overriden ..
        for(int i = 0 ; i <=5 ; i++){               // assigning some work to do 
            System.out.println("khaja ameen");
        }
    }

    public static void main(String[] args) {         // this is main method also called as main thread
        for(int i = 0 ; i<=4 ; i++){                // assigning some work to it 
            System.out.println("kenzee jod");
        }

        Threadclass tc = new Threadclass();       // object of the classs 
        tc.start();                           // this is inbuilt start method of Thread class 

        // start() = is call the run method internally , dont need to call the run method with his name ...
    }
}

// this is how we create a thread using Thread class ......