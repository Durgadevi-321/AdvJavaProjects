package project10;
class Car implements Runnable{
	public void run() {
		for (int i=1;i<=3;i++) {
			System.out.println("BMW car moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}
	}
}
}
class Bike implements Runnable{
	public void run() {
		for (int i=1;i<=3;i++) {
			System.out.println(" ninja Bike  moving"+i);
			try {
				Thread.sleep(500);
			}catch(Exception e) {
		}

	}
}
}

public class simpleracethread {
	public static void main(String[] args) {
		Thread caThread=new Thread(new Car());
		Thread baThread=new Thread(new Bike());
		System.out.println("Gooooo");
		caThread.start();
		baThread.start();
	}
}

