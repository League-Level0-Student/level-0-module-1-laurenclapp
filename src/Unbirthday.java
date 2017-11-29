import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("What is your birthday?");
		if(birthday.equals("11/29")) {
			JOptionPane.showMessageDialog(null, "HAPPY BIRTHDAY");
		}
		else {
			JOptionPane.showMessageDialog(null, "Happy UNbirthday");
		}
	
		
		
	}

}   
