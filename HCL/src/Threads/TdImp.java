package Threads;

public class TdImp implements Runnable {
	public int thrdNo;

	public TdImp(int thrdNo) {
		this.thrdNo = thrdNo;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=1;i<=9;i++){
			System.out.println("i value:"+i+" Thread number is:"+thrdNo);
		}
		}
		
	}


