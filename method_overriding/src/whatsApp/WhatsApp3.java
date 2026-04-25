package whatsApp;

public class WhatsApp3 extends WhatsApp2{
	public void sendMassage(){
		super.sendMassage();
		System.out.println("Blue tick Massage ");
		
	}
	
	public void call() {
		super.call();
		System.out.println("video call Supported ");
		
	}
	public void status() {
		System.out.println("Upload Status ");
	}

}
