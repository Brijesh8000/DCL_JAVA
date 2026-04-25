package whatsApp;

public class WhatsApp2 extends WhatsApp1 {
	public void sendMassage(){
		super.sendMassage();
		System.out.println("Double tick Massage ");
		
	}
	
	public void call() {
		System.out.println("Voice call Supported ");
		
	}

}
