package emailApp;

public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("Farheen", "Ali");

		//em1.setAlternateEmail(null);
//		em1.setAlternateEmail("farheeen.alii23@gmail.com");
//		System.out.println("Your alternate mail is :"+em1.getAlternatEmail());
//		
		System.out.println(em1.showInfo());
	}

}
