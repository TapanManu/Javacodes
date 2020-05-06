class MyThread extends Thread {   //Thread Definition
       public void run() 
            { System.out.println("this thread is running"); 
               for(int i=0;i<5;++i)                                 //              Executed by
               System.out.println(" Child thread   "+i);          //child thread
          }  } 
class ThreadEx1 {
 public static void main(String [] args ) {  
             MyThread t = new MyThread();   
             //upto this only one thread
             t.start();             //produces diff output due to creation of new thread
             //t.run();            //produces same output                                                               
            for(int i=0;i<5;++i)                                                         
                System.out.println("  main thread   "+i);              
} } 
