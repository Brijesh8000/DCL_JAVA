package instagram;

public class Instagram3 extends Instagram2{
	public void uploadPhoto() {
		super.uploadPhoto();
		System.out.println("Upload Reels ");
//		System.out.println("Upload GIF ");

	}
	public void dm() {
		super.dm();
		System.out.println("Send emoji");
	}
	public void story() {
		System.out.println("Upload story");
	}
	

}
