
package exercises;

import java.util.Random;

import javax.swing.JOptionPane;

public class EmailSender {

	void go() {
		/*
		 * Use the methods below to send an email and print a warning if the email did
		 * not send correctly.
		 */
		String email = JOptionPane.showInputDialog("Please, enter email address of the recipient:");
		
		setEmailAddress(email);
		
		String message = JOptionPane.showInputDialog("Now please,  enter message here :");
		
		
		if (send(message) && validEmail(email))
			JOptionPane.showMessageDialog(null, "Email is corectly sent");
		else
			JOptionPane.showMessageDialog(null, "Warning, the email did not send correctly, please try again!");

	}

	/* Returns true if email was sent successfully, false if it failed to send. */
	
	boolean validEmail(String email) {
		if (!(this.emailAddress.contains("@") && this.emailAddress.contains("."))) {
			System.err.println("Invalid email address, please enter the correct one email. ");
		
			return false;
		}
		return true;
	}

	boolean send(String greeting) {
		if (this.emailAddress.isEmpty()) {
			System.err.println("You did not provide a recipient for the email!");
			return false;
		}
		return new Random().nextBoolean();
		
	}

	private String emailAddress = "";

	void setEmailAddress(String email) {
		this.emailAddress = email;
	}

	public static void main(String[] args) {
		new EmailSender().go();
	}
}
