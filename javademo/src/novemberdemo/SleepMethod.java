package novemberdemo;
class SleepMethod extends Thread{  
	 public void run(){  
	  for(int i=1;i<5;i++){  
	    try{
	    	Thread.sleep(500);
	    	}catch(InterruptedException e)
	    {
	    		System.out.println(e);
	    }  
	    System.out.println(i);  
	  }  
	 }  
	 public static void main(String args[]) throws InterruptedException{  
	  SleepMethod t1=new SleepMethod();  
	  t1.join();
	   SleepMethod t2=new SleepMethod();  
	   t2.join();
	   
	  t1.start();  
	  t2.start();  
	 }  
	}  
