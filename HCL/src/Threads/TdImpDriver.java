package Threads;

public class TdImpDriver {

	public static void main(String[] args) {
		//METHOD 1****
//		Thread td1=new Thread(new TdImp(1));
//		Thread td2=new Thread(new TdImp(2));
//		
//		td1.start();
//		td2.start();
		
		//METHOD 2******
		
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				for(int i=1;i<=9;i++){
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//					System.out.println("i value:"+i);
//				}
//				
//			}
//		}).start();;
		
		
		
		
		//METHOD 3
		Thread td=new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=1;i<=9;i++){
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("i value:"+i);
				}
				
			}
		});
		td.start();

	}

}
