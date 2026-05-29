package throws_keyword;

public class Demo2 {
	static void display() throws InterruptedException{
		for(int i=1;i<7;i++) {
			System.out.println(i);
			Thread.sleep(2000);
		}
		
	}
	public static void main(String[] args) {
		try {
			display();
			
		} catch (InterruptedException e) {
			System.out.println("Interrupted Exeception found ");
		}
		
	}

}
