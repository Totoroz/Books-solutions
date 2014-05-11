// Show the message "Hello, name", displaying the name
// that the user typed in.


import javax.swing.JOptionPane;


public class P1_15 {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		System.out.print("Hello, ");
		System.out.println(name);
	}

}
