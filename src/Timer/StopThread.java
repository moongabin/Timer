package Timer;

public class StopThread implements Runnable{
	
	@Override
	
	public void run(){
		try{
			while(!Thread.currentThread().isInterrupted()){
				System.out.println("sleeping");
				
				Thread.sleep(10000);
				System.out.println("thread is live");
				
			}
		}catch(InterruptedException e){
			
		}finally{
			System.out.println("thead is dead");
		}
	}

}
