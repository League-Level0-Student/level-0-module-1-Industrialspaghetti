package _04_secret_message_box;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


import javax.swing.JOptionPane;

/**
 * Secret Message Box / Secure Messaging System
 * 
 * You want to leave a message on one of the Mac computers so that only your friend can read it.
 * You set up the passcode and the secret message. 
 * Your friend types in the passcode to retrieve the message.
 * 
 */

public class SecretMessageBox {
public static void main(String[] args) {
	
	String password = "wqetgqe"; 
	
String Smessage =	JOptionPane.showInputDialog("hey user number 1, type in a secret message");


	// 0. Make a main method and put steps 1-5 inside it
	String passattempt = JOptionPane.showInputDialog("hey user two, wanna see a secret message? wll the only way is to enter a password!");
	// 1. Set a password in a String variable
	if (passattempt .equals(password)){
		JOptionPane.showMessageDialog(null, Smessage);
	
			
		
	}
	else { JOptionPane.showMessageDialog(null, "INTRUDeRRRR!!!!!!!");
	}
	}
	// 2. Using a pop-up, ask the first person for a secret message and store it in a variable

	// 3. Now use a pop-up to tell the NEXT user that they can only see the secret message 
	//    if they can guess the passcode

	// 4. If their guess matches the password, show them the secret message

	// 5. If the password does not match, pop-up "INTRUDER!!"
}

