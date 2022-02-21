package lab8.exercise2;

import java.util.Date;

class TimerDisplay implements Runnable {
	
	public void run() {
		for(int j=0;j<10  ;j++  ) {
			try {
				Date num= new Date();
				System.out.println(num);
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class DisplayTimer {

	public static void main(String[] args) {

		TimerDisplay td = new TimerDisplay();
		Thread t = new Thread(td);
		t.start();
	}

}
