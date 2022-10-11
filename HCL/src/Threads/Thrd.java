package Threads;

public class Thrd extends Thread
{
	public int thrdNo;

	public Thrd(int thrdNo) {
		this.thrdNo = thrdNo;
	}
	@Override
	public void run() {
		countme();
	}
	
	public void countme(){
		for(int i=1;i<=9;i++){
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("i value:"+i+" Thread number is:"+thrdNo);
		}
	}
	
}
