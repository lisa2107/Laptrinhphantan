package code;

public class Util extends Symbol{
	public static void sprintln(String s) {
		if(Symbol.debugFlag) {
			System.out.println(s);
			System.out.flush();
		
		}
	}
	public static void mySleep(int time) {
		try {
			Thread.sleep(time);
		}catch(InterruptedException e) {
			
		}
	}
	public static void myWait(Object obj) {
		
		try {
			obj.wait();
		}catch(InterruptedException e) {}
	}
	

}
