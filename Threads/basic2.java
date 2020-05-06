class TestCallRun2 extends Thread{  
 public void run(){  
  for(int i=1;i<5;i++){  
     
    System.out.println(i);  
  }  
 } 
   }
 class  Demo{
 public static void main(String args[]){  
  TestCallRun2 t1=new TestCallRun2();  
  TestCallRun2 t2=new TestCallRun2();  
   
  t1.run();
  t1.start();  
  t2.run();
  t2.start();
  for(int i=1;i<5;i++){
  	System.out.println("inparent"+i);
  }  
 } 
}  
