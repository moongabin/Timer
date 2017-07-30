package Timer;

import java.util.Date;
import java.util.Timer;

public class MainTimer {

	public static void main(String[] args){
		
		while(true)
		{
			StopThread st = new StopThread();
			Thread th = new Thread(st);
			TimerTest tt =  new TimerTest();
			Timer t = new Timer();
			
			
			Date today = new Date();
			Date d = new Date(today.getYear(),today.getMonth(),today.getDate(),7,30,0);
			t.schedule(tt, d);
			th.start();
			try{
				Thread.sleep(1000*10);
				
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			th.interrupt();
		}
	}
}
