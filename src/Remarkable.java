import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("what is your name?");
	if(name.equalsIgnoreCase("lime")) {JOptionPane.showMessageDialog(null, "i love your hair");}
	
	else if(name.equalsIgnoreCase("yasir")) {JOptionPane.showMessageDialog(null, "hello");}
	
	else if(name.equalsIgnoreCase("victor")) {JOptionPane.showMessageDialog(null, "nice glasses");}
	
	else if(name.equalsIgnoreCase("max")) {JOptionPane.showMessageDialog(null, "hello");}
	
	else if(name.equalsIgnoreCase("callum")) {JOptionPane.showMessageDialog(null, "7nation army");}
}
}
