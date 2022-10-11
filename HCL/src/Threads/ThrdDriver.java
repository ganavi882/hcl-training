package Threads;

public class ThrdDriver {

	public static void main(String[] args) throws InterruptedException {
		Thrd cnt1=new Thrd(1);
		Thrd cnt2=new Thrd(2);
		
		long start=System.currentTimeMillis();
		cnt1.start();
		System.out.println("************");
		cnt2.start();
		Thread.sleep(4515);
		long end=System.currentTimeMillis();
		System.out.println("Total time is:"+(end-start));
		

	}

}
